package computerNetworking;

import java.net.*;

public class UDPonArithmaticServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		DatagramSocket ds = new DatagramSocket(2007);
		String msg;
		do {
		System.out.println("--------------WAIT FOR THE CLIENT--------------");

		byte[] b = new byte[1024];
		DatagramPacket dp  = new DatagramPacket(b,1024);			//receiver 1st receive the message 
		ds.receive(dp);												//receive from the packet
		
		msg = new String(dp.getData()).trim();					//message trim to the byte to msg as the time
		
		int a =(int) msg.charAt(0);
		 msg=String.valueOf(a);
		 
		 
		 
		System.out.println("Message Sent to the client is :" +msg);
		dp = new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2005); //design packet of the given message
		ds.send(dp);
		
	
		}while(true);
	}

}
