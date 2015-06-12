package assignment2;

import assignment1.ZDigit;

public class ZNumber {

	private ZDigit[] digits;
	private String x;

	public ZNumber(String s) {// s = "ABCD"
		char[] c = s.toCharArray();// c = ['a', 'b..
		digits = new ZDigit[c.length];// [d1, d2...]
		for (int i = 0; i < c.length; i++) {
			ZDigit digit = new ZDigit(c[i]);
			digits[i] = digit;
			this.x=s;
		}
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < digits.length; i++) {
			s = s + digits[i];
		}

		return s;
	}
	
	private boolean isValid(char c) {
		return c=='0' || (c > 64 && c < 91);
	}

	public ZNumber(char a, char b, char c, char d) {
		if (isValid(a) && isValid(b) && isValid(c) && isValid(d)) {
			;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int toDecimal() {
		
		char c[] = x.toCharArray();
		int value = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i]=='0') {
				continue;
			} else {
				value = (int) (value + (Math.pow(27, c.length - i - 1) * (c[i] - 64)));
			}
		}
		return (value);
	}
	public ZNumber(char[] c){
		for (int i = 0; i < c.length; i++) {
			ZDigit digit = new ZDigit(c[i]);
	}}
		public ZDigit[] getDigits(){
			return digits;
			
		}

}
