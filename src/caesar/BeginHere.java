package caesar;

import java.util.Scanner;

public class BeginHere {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		
		
		caesarCipher myCipher = new caesarCipher();
		
		System.out.println("Please enter the plain text to encode:");
		String plainText = kbd.nextLine();
		
		System.out.println("Please enter the key:");
		int key = kbd.nextInt();
		System.out.println("Your ket is: " + key);
		
		String codedText = myCipher.encode(plainText, key);
		System.out.println("Your secret message is: " + codedText);
	}

}
