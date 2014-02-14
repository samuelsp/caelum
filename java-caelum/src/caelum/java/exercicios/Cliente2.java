package caelum.java.exercicios;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws UnknownHostException,
			IOException {
		String caminho = "/home/spider/workspace/testes-io/src/testes/arquivo.txt";

		Socket cliente = new Socket("127.0.0.1", 12345);
		System.out
				.println("Conexão estabelecida com o servidor 127.0.0.1:12345");

		ObjectOutputStream out = new ObjectOutputStream(cliente.getOutputStream());
		out.write(caminho.getBytes());
		

	}

}
