
public class runner {

	public static void main(String[] args) {
		HexDecBin baseConverter = new HexDecBin();
		baseConverter.setHexNumber();
		baseConverter.convert();

		BinPower binpower = new BinPower();
		binpower.setBinary();
		
		baseConverter.goodbye();
		
	}

}
