package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
JOptionPane.showMessageDialog(null,"Here is a riddle");JOptionPane.showMessageDialog(null,"Brothers and sisters I have none but this man's father is my father's son.")
;JOptionPane.showInputDialog("Who is the man?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by of 1   
JOptionPane.showMessageDialog(null,"CORRECT YOU HAVE 1 POINT NOW");
		// 5. Otherwise, say "wrong" and tell them the answer
JOptionPane.showMessageDialog(null,"IF YOU DIDN'T SAY THE MAN WAS MY SON YOU ARE INCORRECT YOU HAVE A TOTAL OF 0 POINTS");
		// 6. Add some more riddles

JOptionPane.showMessageDialog(null,"Here is another riddle");
JOptionPane.showMessageDialog(null,"What is greater than God,"+
"more evil than the devil,"+
"the poor have it,"+
"the rich need it,"+
"and if you eat it, you'll die?");
JOptionPane.showInputDialog(null,"What is the answer");
JOptionPane.showMessageDialog(null,"CORRECT YOU HAVE A TOTAL OF 2 POINTS NOW");
JOptionPane.showMessageDialog(null,"IF YOU DIDNT SAY NOTHING YOU ARE INCORRECT YOU HAVE A TOTAL OF 0 OR 1 POINTS");
		// 2. Make a pop up to show the score.
		
	}
}

