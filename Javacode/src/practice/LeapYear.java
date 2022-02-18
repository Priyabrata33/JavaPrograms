package practice;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number");
		
		int n = sc.nextInt();
		
		if (n%4 == 0) {
			System.out.println("A leap year");
		}
		
	}

}
