
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than "yes?" or "no?"
		//	show a pop up that says "You are bananas!?"
		String bananas = JOptionPane.showInputDialog("Do you like bananas?");
		if (bananas.equals("no")) {
			JOptionPane.showMessageDialog(null, "You are crazy.");
		} else if (bananas.equals("yes")) {
			String hobby =JOptionPane.showInputDialog("Whats your favorite hobby?");
			JOptionPane.showMessageDialog(null, hobby + " is so much better with bananas");
		} else {
			JOptionPane.showMessageDialog(null, "You are bananas");
		}
	
		
	}

}
