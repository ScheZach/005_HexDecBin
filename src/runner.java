import javax.swing.JOptionPane;

public class runner {

	public static void main(String[] args) {
		String msgAlpha = "";
		boolean StartLoop = true;
		String ConfirmStop = "No";
		
		while(StartLoop == true) {
		HexDecBin baseConverter = new HexDecBin();
		baseConverter.setHexNumber();
		baseConverter.convert();

		BinPower binpower = new BinPower();
		binpower.setBinary();
		baseConverter.goodbye();
		msgAlpha = "Do you want to do this again? (Y/n)";
		ConfirmStop = JOptionPane.showInputDialog(msgAlpha);
		if (ConfirmStop.equalsIgnoreCase("n")) {
			StartLoop = false;
		}//end of if
		else if (ConfirmStop.equalsIgnoreCase("no")) {
			StartLoop = false;
		}
		else if (ConfirmStop.equalsIgnoreCase("y")) {
			StartLoop = true;
		}
		else if (ConfirmStop.equalsIgnoreCase("yes")) {
			StartLoop = true;
		}
		else {
			JOptionPane.showMessageDialog(null, "I'm sorry but I don't understand that.");
		}
		}
	}

}
