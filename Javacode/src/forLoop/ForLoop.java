package forLoop;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter the number");
//		int tableOf =  sc.nextInt();
//		
//		int i;
//		for(i = 1;i<=10;i++) {
//			
//			int table = tableOf * i ; 
//			
//			System.out.println( table);
//		}
		
		
		
		
		System.out.println("enter the number for the factorial");
		int n = sc.nextInt();
		int factorial = 1 ;
		
		for(int i = n ; i>=1 ; i-- ) {
			
		 factorial = factorial * i;
		}
		System.out.println(factorial);
		
	}

}
