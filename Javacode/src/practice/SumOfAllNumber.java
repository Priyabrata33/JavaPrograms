package practice;

import java.util.Scanner;

public class SumOfAllNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
			
			System.out.println("enter the numbers : ");
			
			int a = sc.nextInt();
			int sum = 0;
		
			while(a !=0) {
				System.out.println("enter the value");
				a = sc.nextInt();
				 sum = sum+a;
			}
			
			
			System.out.println("sum is :" +sum);
			
			
	}

}
