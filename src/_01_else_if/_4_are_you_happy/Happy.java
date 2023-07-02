package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Happy {
	public static void main(String[] args) {

		String happy = JOptionPane.showInputDialog("Are you happy");

		if (happy.equals("yes")) {
			ending();
		} else if (happy.equals("no")) {
			String q1 = JOptionPane.showInputDialog("Do you want to be happy?");
			if (q1.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change Something!");
			} else if (q1.equals("no")) {
				ending();
			}
		}
	}
	
	public static void ending () {
		JOptionPane.showMessageDialog(null, "keep doing what you are doing");
	}
}