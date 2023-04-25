package nirojSirProblems;

import java.util.Scanner;

public class SwapNotUsingThrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner (System.in);
			
			System.out.print("Enter the two number you want to Swap : ");
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("Before Swap : " +a+ " " +b);
			
			
			a = a+b;
			b = a-b;
			a = a-b;
			System.out.println("After Swap : " +a+ " " +b);
	}

}
