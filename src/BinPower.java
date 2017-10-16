import java.util.Scanner;

public class BinPower {
	
	Scanner numScan = new Scanner(System.in);
	String numberS = "";
	int numberI = 0;
	String exponentS = "";
	int exponentI = 0;
	
	public BinPower() {
		
	}// end of constructor
	
	public void setBinary() {
		double exp = exponentI;
		int ans = numberI;
		double answer;
		System.out.println("\nWelcome to the answer genarotor to different powers.");
		System.out.println("What is your base number that you would like to input?");
		ans = numScan.nextInt();
		System.out.println("What is your exponent?");
		exp = numScan.nextDouble();
		//2**2 doesn't work nor does 2^2
		//doesn't need an instance since the method is static
		// (int) "Type Casting" -- pow requires double, which makes no sense in binary
		//so type cast to correct
		answer = Math.pow(ans, exp);
		System.out.println("Answer is: " + answer);
		//System.out.println("\nThank you for using my program!");
		/*
		 * String is cap'd because it is a class
		 * int is not cap'd because it is a primitive type (no class)
		 * Integer --full name, with cap is a class
		 * double is not cap'd because it is a primitive type (no class)
		 */
	}
	
}
