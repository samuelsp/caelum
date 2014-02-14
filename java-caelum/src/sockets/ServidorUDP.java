package sockets;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

import javax.swing.JOptionPane;

public class ServidorUDP {
	public static void main(String[] args) throws IOException {		
		
		int port = 12346;
		
		DatagramSocket ds = new DatagramSocket(port);
		
		System.out.println("Listening port: "+port);
		
		byte[] msg = new byte[256];
		
		DatagramPacket pkg = new DatagramPacket(msg, msg.length);
		
		ds.receive(pkg);
		
		JOptionPane.showMessageDialog(null,new String(pkg.getData()).trim(), "Message received", 1);
		
		ds.close();		
		
	}

}
