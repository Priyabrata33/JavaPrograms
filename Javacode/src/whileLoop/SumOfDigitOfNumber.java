package whileLoop;

import java.util.Scanner;

public class SumOfDigitOfNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter the number");
		int num  = sc.nextInt();
		
		int n = num;
		
		int sum = 0;
		int lastDigit = 0;
		
		while(num>=10) {
			
			lastDigit = num%10;
			num = num/10;
			
			sum = sum+lastDigit;
			
			
			
//			num = num/10;
			
			 System.out.println(lastDigit + " " + num + " " + sum);
			
		}
		
		sum = sum+num;
		
		System.out.println(" the sum of number " +n+" is " + sum);
		
	}

}
