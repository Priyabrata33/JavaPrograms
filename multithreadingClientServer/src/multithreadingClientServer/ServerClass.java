package multithreadingClientServer;

import java.io.*;
import java.io.InputStreamReader;
import java.net.*;

public class ServerClass extends Thread{
	
	Socket skt;
	
	public ServerClass(Socket sc){
		skt = sc;
	}
	
	public void run() {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream())); 
			PrintStream ps = new PrintStream(skt.getOutputStream());
			
			
			String msg;
			
			
			do {
				
				msg = br.readLine();  //assign the upcoming stream to the msg String in the Server  for READ
				System.out.println("Upcoming message from the client " + msg);
				
				
				StringBuilder c = new  StringBuilder(msg);
				c.reverse();
				msg = c.toString();
				
				
				
				
				System.out.println("the message sends to the client is that is after the reverse " +msg);
				ps.println(msg);  //for writing in the output socket of the server side
				
			}while(!msg.equals("dne"));
		}catch(Exception e) {}
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int count =1;
		
		ServerSocket ss = new ServerSocket(2000);
		Socket skt;
		
		ServerClass s;
		do {
			System.out.println("-------SERVER WAITING FOR CLIENT CONNECTION-------");
			skt= ss.accept();
			System.out.println("-------CONNECTION ESTABLISHED-------");
			System.out.println("number f client there " +count++);
			s = new ServerClass(skt);
			s.start();
		}while(true);
		
	}

}
