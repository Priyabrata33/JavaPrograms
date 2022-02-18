package whileLoop;

import java.util.Scanner;

public class HowMay7here {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the numbers : ");
		int num = sc.nextInt();
		
		
		int count = 0 ;
		
		while(num > 0) {
			
			
			int rem = num % 10;
			
			
			if(rem == 2) { 
				
				count++;

			}
			
			num = num/10;
		
		}
		
		
		System.out.println(count);
	
	
	}

}
