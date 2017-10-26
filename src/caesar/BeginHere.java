package caesar;

//import java.util.Scanner;

import javax.swing.JOptionPane;




public class BeginHere {

	public static void main(String[] args) {
		
		Boolean running = true;
		int key;
		String goAgain = "no";
		
		while (running == true) {
		
		Object[] possibilities = {"Encode", "Decode", "Crack", "Exit"};
		String s = (String)JOptionPane.showInputDialog(
		                    null,
		                    "Please make your selection.",
		                    "Start Here",
		                    JOptionPane.PLAIN_MESSAGE,
		                    null,
		                    possibilities,
		                    "encode");
		
		
		
		
		/*
		String msg = "Would you like to encode a plain text message?";
		int confirm = JOptionPane.showConfirmDialog(null,msg);
		*/
		//Scanner kbd = new Scanner(System.in);

		caesarCipher myCipher = new caesarCipher();
		
		
	
		String	msg = "Please enter your plain text to encode";
		String plainText = JOptionPane.showInputDialog(null, msg);
		
		
		

		
		
			msg = "Please enter the key:";
		 key = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
	
		
		
		//System.out.println("Please enter the plain text to encode:");
		//String plainText = kbd.nextLine().toLowerCase();

		System.out.println("Please enter the key:");
		//int key = kbd.nextInt();
		// System.out.println("Your key is: " + key);

		String codedText = myCipher.encode(plainText, key);

		
		
		msg = "Your secret message is: " + codedText;
		JOptionPane.showMessageDialog(null, msg);
		
		
		
		
		
		
		msg = "Do you want to encode another message? (y/n)";
		goAgain = JOptionPane.showInputDialog(null, msg);

		if (goAgain.equalsIgnoreCase("y")) {
			running = true;
		} else if (goAgain.equalsIgnoreCase("n")) {
			running = false;
			msg = "Goodbye,see ya!";
			JOptionPane.showMessageDialog(null, msg);
		} else if (goAgain.equalsIgnoreCase("yes")) {
			running = true;
		} else if (goAgain.equalsIgnoreCase("no")) {
			running = false;
			msg = "Goodbye,see ya!";
			JOptionPane.showMessageDialog(null, msg);
		} else {
			msg = "Please try again";
			JOptionPane.showMessageDialog(null, msg);
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println("Your secret message is: " + codedText);

	}

		}
}
}
