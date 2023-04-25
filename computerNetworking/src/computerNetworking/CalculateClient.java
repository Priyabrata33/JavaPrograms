 package computerNetworking;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class CalculateClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try { 
			
			Socket ss = new  Socket("localhost",2222);
			
			DataOutputStream ds = new DataOutputStream(ss.getOutputStream());	
			
			BufferedReader br = new BufferedReader(new InputStreamReader(ss.getInputStream()));
			
			
			int a;
			int b;
			char op; 
			String msg;
			
			
			do {
				System.out.println("Enter the value you want to calculate: ");
				a = (byte)sc.nextInt();
				ds.write(a);
				ds.flush();
				System.out.print("enter the 2nd number");
				b = (byte)sc.nextInt();
				ds.write(b);
				ds.flush();
				
				System.out.println("enter the operation you want : +,-,*,/");
				op = sc.next().charAt(0);
				ds.write(op);
				ds.flush();
				
				msg = br.readLine();
				System.out.println("THIS IS RECEIVED BY SERVER: "+msg);
				
				
			}while(true);
			
			
			
		}catch(Exception e) {}

	}

}
