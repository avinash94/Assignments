package assignment3;

import assignment1.ZDigit;
import assignment2.ZNumber;

public class problem4 {
	public static void main(String[] args) {
		ZNumber zno = new ZNumber("STRONG");
		ZDigit[] arr = zno.getDigits();
		String s = "";
		for (int i = 0; i < arr.length; i++) {
			s = s + arr[i];
		}
		System.out.println(s);
	}
}
