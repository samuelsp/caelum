package sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ThreadClient extends Thread {

	private Socket cliente;

	public ThreadClient(Socket cliente) {
		this.cliente = cliente;
	}

	public void run() {
		try {
			ObjectInputStream entrada = new ObjectInputStream(
					cliente.getInputStream());
			DataOutputStream saida = new DataOutputStream(
					cliente.getOutputStream());

			String arquivo = (String) entrada.readObject();

			byte buffer[] = new byte[512];

			FileInputStream file = new FileInputStream(arquivo);

			@SuppressWarnings("resource")
			DataInputStream arq = new DataInputStream(file);

			saida.flush();

			int leitura = arq.read(buffer);

			while (leitura != -1) {
				if (leitura != -2) {
					saida.write(buffer, 0, leitura);
				}
				leitura = arq.read(buffer);
			}

			System.out.println("Client serviced successfully: " + arquivo
					+ cliente.getRemoteSocketAddress().toString());
			entrada.close();
			saida.close();
			cliente.close();

		} catch (IOException e) {
			System.out.println("Excecao ocorrida na thread: " + e.getMessage());

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

