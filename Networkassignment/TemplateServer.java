package Networkassignment;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TemplateServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serversocket = new ServerSocket(10020);
		int i=0;
		while (true) {
			System.out.println("Listening on port");
			Socket socket = new Socket();
			socket = serversocket.accept();
			System.out.println("Connection established.");
			MultiThreadingTemplate connection = new MultiThreadingTemplate(
					socket);
			Thread t = new Thread(connection);
			t.start();
			i=i+1;
		}

	}
}
