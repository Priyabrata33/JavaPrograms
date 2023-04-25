package practice;

import java.util.Scanner;

public class problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter the 5 subject");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		
			float perc = (a+b+c+d+e)/5;
			System.out.println(perc);
		
	}

}
