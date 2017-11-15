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
		String codedText = "";
		String comm = "";

		while (running == true) {

			Object[] possibilities = { "Encode", "Decode", "Cracker", "Exit" };
			String showFirst = "Encode";
			s = (String) JOptionPane.showInputDialog(null, "Please make your selection.", "Start Here",
					JOptionPane.PLAIN_MESSAGE, null, possibilities, showFirst);

			caesarCipher myCipher = new caesarCipher();

			if (s.equalsIgnoreCase("encode")) {

				msg = "Please enter your plain text to encode";
				String plainText = JOptionPane.showInputDialog(null, msg);

				msg = "Please enter the key:";
				key = Integer.parseInt(JOptionPane.showInputDialog(null, msg));

				codedText = myCipher.encode(plainText, key);

				msg = "Your secret message is: " + codedText;
				JOptionPane.showMessageDialog(null, msg);

			} // end of 'encode' code

			if (s.equalsIgnoreCase("exit"))
				System.exit(0);

			if (s.equalsIgnoreCase("decode")) {

				msg = "Please enter your plain text to decode";
				String plainText = JOptionPane.showInputDialog(null, msg);

				msg = "Please enter the key:";
				key = Integer.parseInt(JOptionPane.showInputDialog(null, msg));

				codedText = myCipher.encode(plainText, -key);

				msg = "Your secret message is: " + codedText;
				JOptionPane.showMessageDialog(null, msg);

			}

			if (s.equalsIgnoreCase("Cracker")) {

				msg = "Please enter your plain text to crack";
				String plainText = JOptionPane.showInputDialog(null, msg);

				StringBuilder output = new StringBuilder("All possible mesages shown: " + codedText + "\n");

				for (key = 0; key < 38; key++) {

					codedText = myCipher.encode(plainText, -key);
					output.append(codedText + "\n");

				}

				output.append("All posibilites shown");
				JOptionPane.showMessageDialog(null, output);

			}

			msg = "Do you want to encode another message? (y/n)";
			goAgain = JOptionPane.showInputDialog(null, msg);

			if (goAgain.equalsIgnoreCase("y")) {
				running = true;
			} else if (goAgain.equalsIgnoreCase("n")) {
				running = false;
				msg = "Goodbye, see ya!";
				JOptionPane.showMessageDialog(null, msg);
			} else if (goAgain.equalsIgnoreCase("yes")) {
				running = true;
			} else if (goAgain.equalsIgnoreCase("no")) {
				running = false;
				msg = "Goodbye, see ya!";
				JOptionPane.showMessageDialog(null, msg);
			} else {
				msg = "Please try again";
				JOptionPane.showMessageDialog(null, msg);

			}

		}
	}
}







//heck everything (ceaser)







package caesar;

import javax.swing.JOptionPane;

public class caesarCipher {

	private String alpha = "abcdefghijklmnopqrstuvwxyz0123456789.:'";

	public String encode(String plainText, int key) {

		
		 
		
		String secretText = "";
		int index, keyAdded;

		 
		
		
		for (int i = 0; i < plainText.length(); i++) {
			if (plainText.charAt(i) != ' ') {
				index = alpha.indexOf(plainText.charAt(i));
				keyAdded = (index + key) % alpha.length();
				if (keyAdded < 0)
					keyAdded = keyAdded + 39;
				secretText = secretText + alpha.charAt(keyAdded);
				
					
			} else {
				secretText = secretText + " ";
			}
			

		}
		

		return secretText;

	}

}



