package Networkassignment;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class MultiThreadingTemplate implements Runnable {
	private Socket socket;

	MultiThreadingTemplate(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			System.out.println("I am in thread "+Thread.currentThread().getName());
			BufferedReader bf1 = new BufferedReader(new InputStreamReader(
					(socket.getInputStream())));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(
					socket.getOutputStream()), true);
			pw.println("Hello this is Avinash");
			String s=bf1.readLine();
			System.out.println(s);
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
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("..");
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
