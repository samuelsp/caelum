package sockets;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

import javax.swing.JOptionPane;

public class Cliente2 {
	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		@SuppressWarnings("resource")
		Socket cliente = new Socket("localhost", 12345);
		ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
		Date data_atual = (Date)entrada.readObject();
		JOptionPane.showMessageDialog(null, "Date received from the server: "+data_atual.toString());
		entrada.close();
		System.out.println("Connection closed.");
	}

}
