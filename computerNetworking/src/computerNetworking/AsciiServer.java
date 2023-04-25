package computerNetworking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AsciiServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try {
			ServerSocket ss = new ServerSocket(2000);
			
			
			System.out.println("-------SERVER WAITING FOR CLIENT CONNECTION-------");
			
			Socket skt =ss.accept(); //Socket is the client socket where the client request for the process and alll
			
			System.out.println("-------CONNECTION ESTABLISHED-------");
			 
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));   //FOR READING WHAT ARE IN THE COMING MESSAGE 
			 
			PrintStream ps = new PrintStream(skt.getOutputStream());  //FOR PRINTING WHAT WE WANT TO PRINT IN THE AFTER THE ERVER OPRATION I.E. THE REVERSE OF THE MASSAGE
			
			
			String msg;
			char c;
			int asci;
			
			do {
				
				msg = br.readLine();  //assign the upcoming stream to the msg String in the Server  for READ
				//System.out.println("Upcoming message from the client " + msg);
				
				
//				StringBuilder c = new  StringBuilder(msg);
//				c.reverse();
//				msg = c.toString();
				
				
				c = msg.charAt(0);
				
				asci = (int)c;
				
				msg=Integer.toString(asci);
				
				System.out.println("the message send to the client: " +msg);
				ps.println(msg);  //for writing in the output socket of the server side
				
			}while(!msg.equals("end"));
			
			
			 ss.close();
			 skt.close();
		}catch(IOException e) {};
		
	}

		
	}


