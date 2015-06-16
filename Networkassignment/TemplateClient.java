package Networkassignment;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TemplateClient {
	public static void main(String[] args) throws UnknownHostException,
			IOException {
		String host = "localhost";
		Socket socket = new Socket(host, 10020);
		BufferedReader bf = new BufferedReader(new InputStreamReader(
				socket.getInputStream()));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(
				socket.getOutputStream()));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String y = bf.readLine();

		if (y != null) {
			String s;
			System.out.println("Server says:" + y);
			/*
			 * System.out.println("acknowledge"); s = br.readLine();
			 * pw.println(s);
			 */
			BufferedInputStream bis = new BufferedInputStream(
					socket.getInputStream());
			byte[] b = new byte[1024];
			int a;
			BufferedOutputStream bos = new BufferedOutputStream(
					new FileOutputStream("/home/zemoso01/create"));
			while ((a = bis.read(b)) >= 0) {
				System.out.println(a);
				bos.write(b, 0, a);
			}

			// bos.write(b, 0, b.length);
			bos.flush();
			bos.close();
			socket.close();

		}

	}
}
