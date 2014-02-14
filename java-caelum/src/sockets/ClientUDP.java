package sockets;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientUDP {
	
	public static void main(String[] args) throws IOException {
		int port = 12346;
		String address = "localhost";
		String message = "Olá Mundo!";
				
		InetAddress addr = InetAddress.getByName(address);
		
		byte[] msg = message.getBytes();
		
		DatagramPacket pkg = new DatagramPacket(msg, msg.length, addr, port);
		
		DatagramSocket ds = new DatagramSocket();
		
		ds.send(pkg);
		
		System.out.println("Message sent to: "+addr.getHostAddress());
		
		ds.close();
		
	}

}
