package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class MyAges {
	public static void main(String[] args) {
		int myage = 14;
		for (int age = 1; age <= myage; age++) {
			JOptionPane.showMessageDialog(null, "At one point, my age was " + age + ".");
		}
	}
}
