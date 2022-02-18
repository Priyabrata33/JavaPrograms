package nirojSirProblems;

import java.util.Scanner;

public class GreaterThanThreeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("enter the three number : ");
		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int smaller = ( a < b ) ? (a <  c ? a : c) : ( b < c ? b : c) ;// you have to remember all this thing
		
		
		
		System.out.println("smaller amoung three number :" +smaller);
		
		
		
	}

}
