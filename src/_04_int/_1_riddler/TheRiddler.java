package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		
		String riddle = JOptionPane.showInputDialog("Brothers and sisters I have none but this man's father is my father's son.\r\n" + 
				"Who is the man?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (riddle.equals("My son"))
		{
			JOptionPane.showMessageDialog(null, "Correct!");
			score ++;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Wrong!");
		}

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
		riddle = JOptionPane.showInputDialog("What is greater than God,\r\n" + 
				"more evil than the devil,\r\n" + 
				"the poor have it,\r\n" + 
				"the rich need it,\r\n" + 
				"and if you eat it, you'll die?");
				if (riddle.equals("Nothing"))
				{
					JOptionPane.showMessageDialog(null, "Correct!");
					score ++;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Wrong!");
				}

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Score: " + score);
		
	}
}

