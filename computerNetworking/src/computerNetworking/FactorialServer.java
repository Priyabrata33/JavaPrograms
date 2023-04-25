package computerNetworking;

import java.net.*;
import java.io.*;

public class FactorialServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		ServerSocket ss = new ServerSocket(2222);
		System.out.println("-------SERVER WAITING FOR CLIENT CONNECTION-------");
		Socket skt;
		skt = ss.accept();
		
		System.out.println("-------CONNECTION ESTABLISHED-------");
		
		DataInputStream di = new DataInputStream(skt.getInputStream());
		PrintStream ps = new PrintStream(skt.getOutputStream());
		
		int fact;
		int a;

		do {
			
			fact =1;
			
			a =  (int)di.read();
			
			if(a>=1) {
				fact =1;
				for(int i=1;i<a;i++)
					fact += fact*i;
			}
			else if(a==0)
				fact =1;
			else if(a<0)
				break;
			
			String msg = String.valueOf(fact);
			ps.println(msg);
			
		}while(true);
		
	}

}
