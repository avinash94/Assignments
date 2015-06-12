package assignment3;

import assignment2.ZNumber;
import java.util.Scanner;

public class problem3a {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the ZNumber");
		String s = in.nextLine();
		ZNumber znum = new ZNumber(s);
		System.out.println(znum.toDecimal());
		in.close();
	}
}
