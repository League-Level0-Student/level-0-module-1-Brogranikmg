package ifs_ints_and_loops;

import javax.swing.JOptionPane;
//
public class Unbirthday {
	public static void main(String[] args) {
		String date = JOptionPane.showInputDialog("When is your birthday? (MM/DD)");
		if (date.equals("08/08")) {
			JOptionPane.showMessageDialog(null, "Have a happy birthday!");
		} else {
			JOptionPane.showMessageDialog(null, "Have a happy UNbirthday!");
		}
	}
}
