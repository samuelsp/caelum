package sockets;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Servidor2 {
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Server listening on port 12345");
		
		while(true){
			Socket cliente = servidor.accept();
			System.out.println("Client connected: "+cliente.getInetAddress().getHostAddress());
			ObjectOutputStream out = new ObjectOutputStream(cliente.getOutputStream());
			out.flush();
			out.writeObject(new Date());
			out.close();
			cliente.close();
		}
	}
	
}
