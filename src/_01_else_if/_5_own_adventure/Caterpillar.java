package _01_else_if._5_own_adventure;

import java.util.Random;
import javax.swing.JOptionPane;

public class Caterpillar {
	
	static Random ran = new Random();
	
	public static void main(String[] args) {
		String start = JOptionPane.showInputDialog("Start Story");
		
		if (start.equals("yes")) {
			for (int i = 0; i <= 9; i+=1 ) {
				String yum = eat();
				String consume = JOptionPane.showInputDialog("Do you want to eat " + yum );
				if (consume.equals("yes") && yum.equals("barbed wire")) {
					JOptionPane.showMessageDialog(null, "Your caterpillar died.");
				}
				if (consume.equals("yes") && yum.equals("A5 japanese wagyu filet mignot")) {
					ending();
				}
			} 
			JOptionPane.showMessageDialog(null, "Your caterpillar died.");
		} else if (start.equals("no")) {
			JOptionPane.showMessageDialog(null, "Your caterpillar died.");
		}
	}
	
	public static String eat() {
		int foodNum = ran.nextInt(6);
		
		String food = "";
		
		if (foodNum == 5) {
			food = "hamburger";
		} else if (foodNum == 4) {
			food = "rock";
		} else if (foodNum == 3) {
			food = "hammock";
		} else if (foodNum == 2) {
			food = "A5 japanese wagyu filet mignot";
		} else if (foodNum == 1) {
			food = "barbed wire";
		} else {
			food = "leaf";
		}
		
		return food;
	}
	
	public static void ending () {
		JOptionPane.showMessageDialog(null, "Your caterpillar went to sleep and woke up a monarch");
	}
}
