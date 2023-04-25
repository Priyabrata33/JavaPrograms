package computerNetworking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClientEchoServer {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		
		
		
		DatagramSocket ds = new DatagramSocket(2006);
		
		String msg;
		do {
			System.out.println("--------------WAIT FOR THE CLIENT--------------");
			byte[] b = new byte[1024];
			DatagramPacket dp  = new DatagramPacket(b,1024);			//receiver 1st receive the msg 
			ds.receive(dp);
			msg = new String(dp.getData()).trim();			//we change the byte array come from the other end to String
			System.out.println("client: "+msg);
			
			dp =  new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2001);
			ds.send(dp);
			
			
		}while(!msg.equals("end"));
		

	}

}
