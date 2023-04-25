package forLoop;

import java.util.Scanner;

public class Partern4 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int  n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			
			for(int j = 1; j <=(n-i); j++) {
				
				System.out.print ( "  " );
				
				
//				for number you  System.out.println( j+ " ");
				
			}
			
			for(int j = 1;j<=n; j++) {
				System.out.print("*  ");
			}
			System.out.println( );
		}

	}

}
