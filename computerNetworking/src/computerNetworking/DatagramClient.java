package computerNetworking;

import java.net.*;
import java.util.Scanner;

public class DatagramClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		 
		
		System.out.println("--------------WAIT FOR THE OTHE USER--------------");
		
		Scanner sc = new Scanner(System.in);
		DatagramSocket ds= new  DatagramSocket(2006); 		//for Socket to Connection 2006
		
		String msg;
		
		do {
			System.out.print("you: ");
			msg = sc.nextLine();
		
	
		
		DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2001);  //the message that send to the other end
		
		/*
		 * the packet send to the socket in the packet address of the given client 
		 * i.e. the packet is connect to the client the given socket i.e. 2001 
		 * and receive from the socket 2006
		 *  
		 */
		
		ds.send(dp);//for send the packet that we created ;
		
		
		byte b[] = new byte[1024];
		dp = new DatagramPacket(b,1024);  //datagramPacket is a byte stream so we change the String to the Byte stream to recieved Byte ; 
		ds.receive(dp);					//recive of the dp that come from the other end
		
		
		msg = new String(dp.getData()).trim();			//we change the byte array come from the other end to String
		System.out.println("client: "+msg);
		
		
		}while(!msg.equals("bye"));
		ds.close();
		
	}

}
