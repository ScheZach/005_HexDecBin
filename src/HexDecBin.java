import java.util.Scanner;

public class HexDecBin {
	
	Scanner kbd = new Scanner(System.in);
	String name = "";
	String hex = "";
	int num;
	
	public HexDecBin() {
		System.out.println("Welcome to my Hexadecimal, Decimal, or Binary conversion program");
		System.out.println("What is your name?");
		name = kbd.nextLine();
		System.out.println("Very nice to meet you " + name + " let's begin: ");
	}// end of constructor
	
	public void setHexNumber() {
		System.out.println("\nEnter the hex number :");
		hex = kbd.nextLine();
		num = Integer.parseInt(hex, 16);
		System.out.println("You have entered hex " + hex);
		System.out.println("Decimal value is: " + num + " " + "(remember 0-" + num + " has " + (num+1) + " values)");
	}
	
	public void convert() {
		String binary = Integer.toBinaryString(num);
		int nibblesBeta = binary.length();
		int nibbles = nibblesBeta/4;
		int bytes = nibblesBeta/8;
		
		System.out.println("Binary value is: " + binary);
		System.out.println("Number of bits is " + binary.length());
		System.out.println("Number of whole nibbles is " + nibbles);
		System.out.println("Number of whole bytes is " + bytes);
	}
	public void goodbye() {
		System.out.println("\nThank you for using my program " + name);
	}
	
	
}
