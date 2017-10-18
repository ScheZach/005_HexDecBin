import java.util.Scanner;

import javax.swing.JOptionPane;

public class HexDecBin {
	
	Scanner kbd = new Scanner(System.in);
	String name = "";
	String hex = "";
	int dec;
	String bin = "";
	String inputType = "";
	String convertType = "";
	int num;
	String BinNum = "";
	
	private String msg = "";
	private boolean StopLoop = false;
	private String ConfirmStart = "Yes";
	
	
	public HexDecBin() {
		System.out.println("Welcome to my Hexadecimal, Decimal, or Binary conversion program");
		System.out.println("What is your name?");
		name = kbd.nextLine();
		System.out.println("Very nice to meet you " + name + " let's begin: ");
	}// end of constructor
	
	public void setHexNumber() {
		while(StopLoop == false) {
			System.out.println("\nWhat would you like your base input type to be?");
			inputType = kbd.nextLine();
			System.out.println("\nWhat would you like your convertion input type to be?");
			convertType = kbd.nextLine();
			if (inputType == "Hexadecimal" && convertType == "Decimal") {
				System.out.println("\nEnter the hex number :");
				hex = kbd.nextLine();
				num = Integer.parseInt(hex, 16);
				System.out.println("You have entered hex " + hex);
				System.out.println("Decimal value is: " + num);
			}
			else if (inputType == "Hexadecimal" && convertType == "Binary") {
				System.out.println("\nEnter the hex number :");
				hex = kbd.nextLine();
				num = Integer.parseInt(hex, 16);
				BinNum = Integer.toBinaryString(num);
				System.out.println("You have entered hex " + hex);
				System.out.println("Decimal value is: " + BinNum);
			}
			else if (inputType == "Decimal" && convertType == "Hexadecimal") {
				System.out.println("\nEnter the dec number :");
				dec = kbd.nextInt();
				num = dec;
				hex = Integer.toHexString(dec).toUpperCase();
				System.out.println("You have entered dec " + dec);
				System.out.println("Hex value is: " + hex);
			}
			else if (inputType == "Decimal" && convertType == "Binary") {
				System.out.println("\nEnter the dec number :");
				dec = kbd.nextInt();
				num = dec;
				bin = Integer.toBinaryString(dec);
				System.out.println("You have entered dec " + dec);
				System.out.println("Bin value is: " + bin);
			}
			else if (inputType == "Binary" && convertType == "Hexadecimal") {
				System.out.println("\nEnter the bin number :");
				bin = kbd.nextLine();
				num = Integer.parseInt(bin, 2);
				hex = Integer.toHexString(dec).toUpperCase();
				System.out.println("You have entered bin: " + bin);
				System.out.println("Hex value is: " + hex);
			}
			else if (inputType == "Binary" && convertType == "Decimal") {
				System.out.println("\nEnter the bin number :");
				bin = kbd.nextLine();
				num = Integer.parseInt(bin, 2);
				System.out.println("You have entered bin: " + bin);
				System.out.println("Dec value is: " + num);
			}
			else {
				System.out.println("Please input the complete word and check your spelling");
				num = 0;
			}
			msg = "Do you want to do this again? (Y/n)";
			ConfirmStart = JOptionPane.showInputDialog(msg);
			if (ConfirmStart.equalsIgnoreCase("n")) {
				StopLoop = true;
				JOptionPane.showMessageDialog(null, "lets continue");
			}//end of if
			else if (ConfirmStart.equalsIgnoreCase("no")) {
				StopLoop = true;
				JOptionPane.showMessageDialog(null, "lets continue");
			}
			else if (ConfirmStart.equalsIgnoreCase("y")) {
				StopLoop = false;
			}
			else if (ConfirmStart.equalsIgnoreCase("yes")) {
				StopLoop = false;
			}
			else {
				JOptionPane.showMessageDialog(null, "I'm sorry but I don't understand that.");
			}
		}//end of while
	}
	
	public void convert() {
		String binary = Integer.toBinaryString(num);
		int nibblesBeta = binary.length();
		int nibbles = nibblesBeta/4;
		int rNibbles = nibblesBeta%4;
		int bytes = nibblesBeta/8;
		int rBytes = nibblesBeta%8;
		
		System.out.println("Binary value is: " + binary);
		System.out.println("Number of bits is " + binary.length());
		System.out.println("Number of whole nibbles is " + nibbles + ", and the remainder is " + rNibbles);
		System.out.println("Number of whole bytes is " + bytes + ", and the remainder is " + rBytes);
	}
	public void goodbye() {
		System.out.println("\nThank you for using my program " + name);
	}
	
	
}