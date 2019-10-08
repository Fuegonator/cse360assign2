/*
 * Name: Connor Seawright
 * Class ID: 70641
 * Assignment: 2
 * This code is for adding or subtracting numbers from 
 * a total and documenting the actions in the order they
 * were performed.
 */

package cse360assign2;

public class AddingMachineFinished {
	
	private int total;
	
	private String line = "0";
	
	public AddingMachineFinished () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		String str = Integer.toString(value);
		line += "+" + str;
		total += value;
	}
	
	public void subtract (int value) {
		String str = Integer.toString(value);
		line += "-" + str;
		total -= value;
	}
		
	public String toString () {
		return line;
	}

	public void clear() {
	line = "0";
	total = 0;
	}
}


