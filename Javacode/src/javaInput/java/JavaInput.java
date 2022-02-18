package javaInput.java;
import java.util.Scanner;

public class JavaInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the principal");
		int principal = sc.nextInt();
		
		
		System.out.println("enter the rate");
		float rate = sc.nextFloat();
		
			
			
		
		System.out.println("enter the time");
		int time = sc.nextInt();
		
		
		
		float simpleInterest = principal*rate*time/100;
		
				
		System.out.println("simple interest = " +simpleInterest);
		

	}

}
