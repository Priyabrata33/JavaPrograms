package computerNetworking;

import java.io.*;

import java.net.*;
import java.util.Scanner;

public class FactorialClient {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		Socket ss = new  Socket("localhost",2222);
		Scanner sc = new  Scanner(System.in);
		DataOutputStream ds = new DataOutputStream(ss.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(ss.getInputStream()));
		byte a;
		
		do {
			System.out.println("Enter the number For Factor : ");
			a = (byte)sc.nextInt();
			
			ds.write(a);
			ds.flush();
			
			System.out.println("Factor Of it is : " +br.readLine());
			
			
			
			
		}while(true);
		
	}

}
