package computerNetworking;

import java.util.*;
import java.net.*;

public class UDPonArithmaticClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		DatagramSocket ds = new DatagramSocket(2005);
		
		
		String msg;
		do {
			System.out.println("enter the character whose ascii code you want: ");
			msg = sc.nextLine();
			
			DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2007);   //packet creation
			ds.send(dp);
			
			
			byte[] b = new byte[1024];
			dp =  new DatagramPacket(b,1024);
			ds.receive(dp);
			
			msg = new String(dp.getData()).trim();
			System.out.println("Ascii Code is: "+msg);
			
		}while(!msg.equals("end"));

	}

}
