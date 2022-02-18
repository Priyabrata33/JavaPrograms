package practice;

import java.util.Scanner;

public class LCMandHCF {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the value of two number : ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = a;
		int y = b;
		
		while(b!=0) {
			int t = b;
			b = a% b;
			a = t;
			
		}
		 int gcd = a;
		 
		 int lcm  = (x *y)/gcd;
		 System.out.println(" HCF : " +gcd+ " / LCM : " +lcm );
		

	}

}
