package whileLoop;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the number:");
		int num = sc.nextInt();
		
		int ans = 0;
		
		
		while (num> 0 ) {
			
			int rem = num % 10;
			
			num = num/10;
			
			
			//or u jst write System.out.print(rem): to get the reverse ans withou
			
			
			ans = ans *10 + rem;
			
		}
		
		System.out.println(ans);
		
		
		
	}

}
