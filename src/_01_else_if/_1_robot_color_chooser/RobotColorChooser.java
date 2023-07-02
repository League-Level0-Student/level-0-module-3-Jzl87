
package _01_else_if._1_robot_color_chooser;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args)  {
		
		//1. Create a new Robot
		Robot rob = new Robot();
		Random ran = new Random();
		
		int num = 4;
		
		while (num == 4) {
	    //2. Make the robot draw a shape (this will take more than one line of code)
		String color = JOptionPane.showInputDialog("What color would you like? (");
		
		if (color.equals("green")) {
			rob.setPenColor(0,255,0);
		} else if (color.equals("red")) {
			rob.setPenColor(255,0,0);
		} else if (color.equals("blue")) {
			rob.setPenColor(0,0,255);
		} else { 
			rob.setPenColor(ran.nextInt(255),ran.nextInt(255),ran.nextInt(255));
		}
		
		rob.penDown();
		rob.setSpeed(50);
		rob.setPenWidth(10);

		for (int i = 0; i <=3; i += 1) {
		rob.move(60);
		rob.turn(90);
		}
	}
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
