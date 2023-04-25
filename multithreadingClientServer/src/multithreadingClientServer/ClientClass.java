package multithreadingClientServer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ClientClass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Socket skt = new Socket("localhost",2000);
		
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //here it take input from the keyboard and take some value from the reader
		//buffered reder cant direct the value  so it goes through the inputStream reader value
		
		BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
		
		PrintStream ps = new PrintStream(skt.getOutputStream()); //for write something in the  
		
		String msg;
		
		do {
			msg = bf.readLine();
			ps.println(msg);
			
			
			msg = br.readLine();
			System.out.println(msg);
			
		}while(!msg.equals("dne"));


	}

}
