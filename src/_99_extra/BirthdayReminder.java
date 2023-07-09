
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String sistersBirthday = "July 17th";
		String dadsBirthday = "ocober 10th";
		String myBirthday = "september 11th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday = JOptionPane.showInputDialog("which birthday would you like?");
		// 3. Print out what the user typed
		System.out.println(birthday);
		// 4. if user asked for "mom"
		if (birthday.equals("sister")) {
			System.out.println(sistersBirthday);
		} else if (birthday.equals("dad")) {
			System.out.println(dadsBirthday);
		} else if (birthday.equals("Mine")) {
			System.out.println(myBirthday);
		} else {
			System.out.println("Sorry, I dont remember this birthday");
		}
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
