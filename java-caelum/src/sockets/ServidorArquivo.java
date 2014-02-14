package sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorArquivo {
	public static void main(String[] args) throws IOException {
		int port = 12347;
		System.out.println("Launching server...");

		@SuppressWarnings("resource")
		ServerSocket server = new ServerSocket(port);
		System.out.println("Server started, listening port " + port);

		while (true) {
			Socket client = server.accept();
			new ThreadClient(client).start();
		}

	}
}
