package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
	String jane = "Wonderful";
	String bob = "funny";
	String kate = "nice";
	String jake = "out-going";
		// 2. Ask the user to enter a name. Store their answer in a variable.
	String userInput = JOptionPane.showInputDialog("Enter a name.");
 
		// 3. In a pop-up, tell the user what is remarkable about that person. 
	if (userInput.equals("Jane"))
	{
		JOptionPane.showMessageDialog(null, jane);
	}
	
	else if (userInput.equals("Bob"))
	{
		JOptionPane.showMessageDialog(null, bob);
	}
	
	else if (userInput.equals("Kate"))
	{
		JOptionPane.showMessageDialog(null, kate);
	}
	
	else if (userInput.equals("Jake"))
	{
		JOptionPane.showMessageDialog(null, jake);
	}

	}
}

