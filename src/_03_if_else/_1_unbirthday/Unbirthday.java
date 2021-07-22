package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("Is your birthday today? Yes or No?");
		if (birthday.equals("yes")) {
			JOptionPane.showMessageDialog(null,"Happy Birthday");
		}
		if(birthday.equals("no")) {
			JOptionPane.showMessageDialog(null,"Happy UNBirthday ");
			}
	}
}
