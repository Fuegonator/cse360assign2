/*
 * Name: Connor Seawright
 * Class ID: 70641
 * Assignment: 2
 * This code is for adding or subtracting numbers from 
 * a total and documenting the actions in the order they
 * were performed.
 */

package cse360assign2;

public class AddingMachineFinished {//This class contains methods to run various 
									//mathematical operations.
	
	private int total;//Global variable that holds the total number
	private String line = "0";//String line that hold the history of operations
	
	public AddingMachineFinished () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {//This method return the current total
		return total;
	}
	
	public void add (int value) {//This method adds the passed integer to the total amount
		String str = Integer.toString(value);
		line += " + " + str;
		total += value;
	}
	
	public void subtract (int value) {//This method subtracts the passed integer to the total amount
		String str = Integer.toString(value);
		line += " - " + str;
		total -= value;
	}
		
	public String toString () {//This method returns the operation history
		return line;
	}

	public void clear() {//This clears the history and the total.
	line = "0";
	total = 0;
	}
}


