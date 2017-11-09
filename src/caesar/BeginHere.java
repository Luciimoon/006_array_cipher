package caesar;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class BeginHere {

	public static void main(String[] args) {

		String msg = "";
		Boolean running = true;
		int key;
		String goAgain = "no";
		String s = "";

		while (running == true) {

			Object[] possibilities = { "Encode", "Decode", "Crack", "Exit" };
			String showFirst = "Encode";
			s = (String) JOptionPane.showInputDialog(null, "Please make your selection.", "Start Here",
					JOptionPane.PLAIN_MESSAGE, null, possibilities, showFirst);

			caesarCipher myCipher = new caesarCipher();

			if (s.equalsIgnoreCase("encode")) {

				msg = "Please enter your plain text to encode";
				String plainText = JOptionPane.showInputDialog(null, msg);

				msg = "Please enter the key:";
				key = Integer.parseInt(JOptionPane.showInputDialog(null, msg));

				// System.out.println("Please enter the key:");

				String codedText = myCipher.encode(plainText, key);

				msg = "Your secret message is: " + codedText;
				JOptionPane.showMessageDialog(null, msg);

			} // end of 'encode' code

			// if(s.equalsIgnoreCase("exit"))
			// System.exit(0);

			if (s.equalsIgnoreCase("decode")) {

				msg = "Please enter your plain text to decode";
				String plainText = JOptionPane.showInputDialog(null, msg);

				msg = "Please enter the key:";
				key = Integer.parseInt(JOptionPane.showInputDialog(null, msg));

				// System.out.println("Please enter the key:");

				String codedText = myCipher.encode(plainText, -key);

				msg = "Your secret message is: " + codedText;
				JOptionPane.showMessageDialog(null, msg);

			}
			
			
			if (s.equalsIgnoreCase("Cracker")) {

				msg = "Please enter your plain text to crack";
				String plainText = JOptionPane.showInputDialog(null, msg);

				for (key = 0; key < 38; key++) {
					
				}
				
				

				String codedText = myCipher.encode(plainText, key);

				msg = "Your secret message is: " + codedText;
				JOptionPane.showMessageDialog(null, msg);
				
			}

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

			}

		}
	}
}
