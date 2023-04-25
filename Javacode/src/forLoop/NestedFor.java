package forLoop;

import java.util.Scanner;

public class NestedFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter the number upto");
		int n =sc.nextInt();
		
		int result = 1;
		for (int i=1;i<= n; i++ ) {
			for (int i1 = 1; i1<=10; i1++) {
				
				result =  i * i1 ;
				System.out.print(result +" ");
			}
			
			System.out.println( );
		}
	}

}
