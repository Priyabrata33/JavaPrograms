package nirojSirProblems;

import java.util.Scanner;

public class Swpping {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the two number you want to swap : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("before swap : " +a + " " +b);
		
		
		int temp = a; 
			a = b;
			b = temp;
			
		System.out.println("after Swap : " +a + " " +b);
		
		
	}

}
