package Decipher;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class problem59 {
	public static void main(String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new FileReader(
				"/home/zemoso01/p059_cipher.txt"));
		int sum = 0;
		String s;
		String[] arr = null;
		BufferedReader br = new BufferedReader(new FileReader(
				"/home/zemoso01/p059_cipher.txt"));
		s = br.readLine();
		arr = s.split(",");

		int brr[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			brr[i] = Integer.parseInt(arr[i]);
		}
		ArrayList<StringBuilder> list = new ArrayList<StringBuilder>();
		char a, b, c, d;
		int l = 0;
		StringBuilder message = new StringBuilder();
		for (int i = 97; i < 123; i++) {
			for (int j = 97; j < 123; j++) {
				for (int k = 97; k < 123; k++) {
					for (int n = 0; n < 1199; n = n + 3) {
						a = (char) (brr[n] ^ i);
						b = (char) ((brr[n + 1]) ^ j);
						c = (char) ((brr[n + 2]) ^ k);
						message.append("" + a + b + c);
						if (n == 1197) {
							d = (char) (brr[1200] ^ i);
							message.append("" + d);
						}
					}
					if ((message.indexOf(" the ")) >= 0) {
						for (int p = 0; p < 1201; p++) {
							sum += message.charAt(p);
						}
						System.out.println(message);
						System.out.println(sum);
					}

					list.add(message);

					message = new StringBuilder("");

				}
			}
		}
		buffer.close();
		br.close();

	}
}
