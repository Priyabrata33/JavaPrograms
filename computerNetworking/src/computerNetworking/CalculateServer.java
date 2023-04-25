package computerNetworking;
import java.net.*;
import java.io.*;


public class CalculateServer {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ServerSocket ss = new ServerSocket(2222);
		
		System.out.println("-------SERVER WAITING FOR CLIENT CONNECTION-------");
		
		
		Socket skt = ss.accept();			//Accept the Socket of the client 
		
		
		System.out.println("-------CONNECTION ESTABLISHED-------");
		
		DataInputStream di =new DataInputStream(skt.getInputStream());		//bufferReader for the input get by the Client
		
		DataOutputStream ds =new DataOutputStream(skt.getOutputStream());	//for send back the result to the client site
		PrintStream ps = new PrintStream(skt.getOutputStream());
		
		int a,b;
		String p;
		char op;
		String msg;
		
		do {
			System.out.println("Reading value From Client");
			a = (int)di.read();
			System.out.println("get a " +a);
			b = (int)di.read();
			System.out.println("get b " +b);
			
			op =(char) di.readByte();
			
			
			System.out.println("the opration between and the operation in between : "+a+ " "+b+ " "+op);
			
		
			 
			switch(op) {
			
				case '+' : msg = Integer.toString(a+b);
						break ; 
						
				case '-' : msg = Integer.toString(a-b);
						break;
						
				case '*' : msg = Integer.toString(a*b);
							break;
			
				case '/' : msg = Integer.toString(a/b);
						break;
									
				default : 
					msg = "Send Valid intput for Calculation";				
						
			}
			
	
	
			
			System.out.println("answer send to client is :"+msg);
			
			ps.println(msg);
			
			
	
			
		}while(true);
		
		}catch(Exception e) {}
		
	}

}
