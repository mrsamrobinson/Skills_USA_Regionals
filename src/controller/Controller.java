package controller;

import view.AppView;

public class Controller
{
	private AppView myView;
	
	private String[][] myTable;
	
	private int slot = 1;
	
	public Controller()
	{
		myView = new AppView(this);
		myTable = new String[4][4];
	}
	
	public void start()
	{
		myView.begin();
	}
	
	public void makeMyTable()
	{
		for(int row = 0; row < myTable.length; row++)
		{
			for(int col = 0; col < myTable[0].length; col++)
			{
				myTable[row][col] = "Slot" + slot;
				
				slot++;
			}
		}
		
	}
	
	public String printMyTable()
	{
		String output = "";
		
		for(int row = 0; row < myTable.length; row++)
		{
			for(int col = 0; col < myTable[0].length; col++)
			{
				output += myTable[row][col] + "\t";
			}
			
			output += "\n";
		}
		
		return output;
	}
}
