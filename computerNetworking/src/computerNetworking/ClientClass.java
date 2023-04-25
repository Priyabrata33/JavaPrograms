package computerNetworking;


import java.net.*;
import java.io.*;

public class ClientClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Socket skt = new Socket("localhost",2000); 
		
		 
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //here it take input from the keyboard and take some value from the reader
		
		//buffered reAder cant direct the value  so it goes through the inputStream reader value
		
		
		PrintStream ps = new PrintStream(skt.getOutputStream()); //for write something in the  
		
		BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
		
		
		
		String msg;
		
		do {
			msg = bf.readLine();
			ps.println(msg);
			
			
			
			//input from the Server
			msg = br.readLine();
			System.out.println("THIS IS RECEIVED BY SERVER: "+msg);
			
		}while(!msg.equals("end"));
		skt.close();

	}

}
