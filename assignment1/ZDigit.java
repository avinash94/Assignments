package assignment1;

public class ZDigit {

	private char digit;

	public ZDigit(char digit) {
		if (digit == 48 || (digit < 91 && digit > 64)) {
			this.digit = digit;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public String toString() {
		return "" + digit;
	}

}
