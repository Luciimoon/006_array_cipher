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

			Object[] possibilities = {"Encode", "Decode", "Crack", "Exit"};
			String showFirst = "Encode";
			 s = (String)JOptionPane.showInputDialog(
			                    null,
			                    "Please make your selection.",
			                    "Start Here",
			                    JOptionPane.PLAIN_MESSAGE,
			                    null,
			                    possibilities,
			                    showFirst);

			caesarCipher myCipher = new caesarCipher();
			
			
			if(s.equalsIgnoreCase("encode")) {
				
 		
			 msg = "Please enter your plain text to encode";
			String plainText = JOptionPane.showInputDialog(null, msg);

			msg = "Please enter the key:";
			key = Integer.parseInt(JOptionPane.showInputDialog(null, msg));

			//System.out.println("Please enter the key:");

			String codedText = myCipher.encode(plainText, key);

			msg = "Your secret message is: " + codedText;
			JOptionPane.showMessageDialog(null, msg);
			
			}//end of 'encode' code
			
			//if(s.equalsIgnoreCase("exit")) 
				//System.exit(0);
		
		
		
		if(s.equalsIgnoreCase("decode")) {
		
 		
		 msg = "Please enter your plain text to decode";
		String plainText = JOptionPane.showInputDialog(null, msg);

		msg = "Please enter the key:";
		key = Integer.parseInt(JOptionPane.showInputDialog(null, msg));

		//System.out.println("Please enter the key:");

		String codedText = myCipher.encode(plainText, -key);
		//int intText = Integer.parseInt(codedText);
		//if (intText < 0)
		//	codedText = "40";
		
			
			
		

		msg = "Your secret message is: " + codedText;
		JOptionPane.showMessageDialog(null, msg);
		
		}
		
		
		
		
//weird code
		//	if (s == null) s = "Cancelled";// .equals doesn't work, null is not a String
		//	JOptionPane.showMessageDialog(null, "You have selected: " + s);
			/*
			switch (s) { // switch on String allowed in Java 7 and higher
			
			case "Encode":
				
				
			    msg = "Please enter your plain text to encode";
				String plainText = JOptionPane.showInputDialog(null, msg);

				msg = "Please enter the key:";
				key = Integer.parseInt(JOptionPane.showInputDialog(null, msg));

				System.out.println("Please enter the key:");

				String codedText = myCipher.encode(plainText, key);

				msg = "Your secret message is: " + codedText;
				JOptionPane.showMessageDialog(null, msg);
				
				
				break;
				//break means all done, leave the switch block - almost always use break
				//if no break, execution continues for all remaining cases
			case "Decode":
				JOptionPane.showMessageDialog(null, 
					"We are now in the Decoder switch block - add some code!");
				break;
			case "Cracke":
				JOptionPane.showMessageDialog(null, 
					"We are now in the Cracker switch block - add some code!");
				break;
			case "Exit":
				JOptionPane.showMessageDialog(null, 
					"We are now in the Exit switch block - so add some code already to get us out of here!");
				break;
			default:
				JOptionPane.showMessageDialog(null, 
					"We are now in the Unknown Case or Cancelled switch block - what do you want to do?");
			}
			*/
			

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

