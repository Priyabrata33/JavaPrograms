package computerNetworking;
import java.net.*;
import java.util.*;

public class UDPClientEchoClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		DatagramSocket ds = new DatagramSocket(2001);
		
		

		Scanner sc = new Scanner (System.in);
		String msg;
		do {
			
			System.out.print("Enter the message you want to send to the Server: ");
		 msg = sc.nextLine();
		 DatagramPacket dp  = new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2006);
		 ds.send(dp);
		 
		 byte b[] = new byte[1024];
			dp = new DatagramPacket(b,1024);  //datagramPacket is a byte stream so we change the String to the Byte stream to recieved Byte ; 
			ds.receive(dp);					//recive of the dp that come from the other end
			
			
			msg = new String(dp.getData()).trim();			//we change the byte array come from the other end to String
			System.out.println("Server: "+msg);
		 
		}while(!msg.equals("end"));
		
	}

}
