package practice;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		int total = 0;
		
		
		int num = number;
		while (num != 0) {
			int temp ;
			temp = num % 10;
			total = total + temp;
			
			num  = num /10;
		}
		
		if (total == num ) {
			System.out.println("Amstrong number");
		}else {
			System.out.println("NT amstrong number");
		}
		
	}

}
