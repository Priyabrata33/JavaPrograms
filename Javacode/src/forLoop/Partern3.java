package forLoop;

import java.util.Scanner;

public class Partern3 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int  n = sc.nextInt();
		
		for(int i = n; i>=1;i--) {
			
			for(int j = 1; j <=i; j++) {
				
				System.out.print ( " * " );
				
				
//				for number you  System.out.println( j+ " ");
				
				
			}
			
			System.out.println( );
		}

	}

}
