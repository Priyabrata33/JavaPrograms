package practice;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter the number");
		int n = sc.nextInt();
		int i=2;
		
		while(n!=0) {
			if(n%i==0) {
				System.out.println("not a Prime number");
			}else {
				System.out.println("prime number");
		}
		i++;	
		
		
		}
		
		
	}

}
