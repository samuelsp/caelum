package sockets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorDeArquivo {
	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		int port = 12347;
		ServerSocket server = new ServerSocket(port);
		System.out.println("Servidor escutando na porta 12347");
		Socket cliente = server.accept();
		System.out.println("Cliente conectado "
				+ cliente.getInetAddress().getHostAddress());

		ObjectInputStream entrada = new ObjectInputStream(
				cliente.getInputStream());		
		
		InputStream is = new FileInputStream((String) entrada.readObject());
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream os = new FileOutputStream("/home/spider/workspace/testes-io/src/testes/saida.txt");
	    OutputStreamWriter osw = new OutputStreamWriter(os);
	    BufferedWriter bw = new BufferedWriter(osw);
		
		String content = br.readLine();
		
		while(content != null){
			System.out.println(content);
			bw.write(content + "\n");
			content = br.readLine();
		}
		
		br.close();	
		bw.close();
		server.close();

	}

}
