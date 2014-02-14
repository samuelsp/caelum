package sockets;

import java.io.IOException;

import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteDeArquivo {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket cliente = new Socket("localhost", 12347);				
		ObjectOutputStream out = new ObjectOutputStream(cliente.getOutputStream());
		out.flush();
		out.writeObject(new String("/home/spider/workspace/testes-io/src/testes/arquivo.txt"));
		out.close();
		cliente.close();
	}

}
