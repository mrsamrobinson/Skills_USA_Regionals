package view;

import javax.swing.JOptionPane;

import controller.Controller;

public class AppView
{
	private Controller baseController;

	public AppView(Controller baseController)
	{
		this.baseController = baseController;
	}

	public void begin()
	{
		JOptionPane.showMessageDialog(null, "Let's play with a loop.");

		String name = JOptionPane.showInputDialog("What is your name?");

		String temp = JOptionPane.showInputDialog("How many times should I print your name?");

		int howMany = Integer.parseInt(temp);

		for (int count = 0; count < howMany; count++)
		{
			System.out.println(name);
		}

		JOptionPane.showMessageDialog(null, "That was a very simple loop wasn't it?\nLet's use one that is a little more complicated.");
		
		JOptionPane.showMessageDialog(null, "I like tables, let's use a loop to\nmake a table and then print it.");
		
		baseController.makeMyTable();
		
		System.out.println("\n\n\n");
		System.out.println(baseController.printMyTable());
		
		JOptionPane.showMessageDialog(null, "I just made a 4X4 table and then\nprinted it in the console");
	}

}
