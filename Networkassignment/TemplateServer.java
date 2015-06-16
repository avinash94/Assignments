package Networkassignment;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TemplateServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serversocket = new ServerSocket(10020);
		Socket socket = new Socket();
		socket = serversocket.accept();

		BufferedReader bf1 = new BufferedReader(new InputStreamReader(
				(socket.getInputStream())));
		System.out.println("Connecting to client");
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(
				socket.getOutputStream()), true);
		pw.println("Hello this is Avinash");
		File F = new File("/home/zemoso01/tee");
		byte[] b = new byte[1024];
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(F));
		BufferedOutputStream bos = new BufferedOutputStream(
				socket.getOutputStream());
		int a;
		while ((a = bis.read(b)) >= 0) {
			bos.write(b, 0, a);
		}

		bos.flush();

	}

}
