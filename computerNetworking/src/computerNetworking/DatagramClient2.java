package computerNetworking;
import java.net.*;
import java.util.*;


public class DatagramClient2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("--------------WAIT FOR THE OTHE USER--------------");
		
		DatagramSocket ds = new DatagramSocket(2001);
		
		String msg;
		
		do {
		
		byte[] b = new byte[1024];
		DatagramPacket dp  = new DatagramPacket(b,1024);			//receiver 1st receive the msg 
		ds.receive(dp);
		
		
		
		
		msg = new String(dp.getData()).trim();		//change the byte received to the String format
		System.out.println("client: "+msg);
		
		
		System.out.print("you: ");
		msg = sc.nextLine();							//write the reply the message
		dp = new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2006);  //creation of the packet for send
		
		ds.send(dp);		//send  the datagramSocket
		}while(!msg.equals("bye"));
		
		ds.close();
	}

}
