package practice;

import java.util.Scanner;

public class LargestBetweenTwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter teh two number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b)  System.out.println("big is " +a+ " . ");
		
		else 	 System.out.println("big is " +b+ " . ");
		
		
		
	}

}
