package nirojSirProblems;

import java.util.Scanner;

public class FarenhiteTocelcius {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the farenhite : ");
		float f = sc.nextFloat();
		
		float c =  (float) ((5.0/9.0) * (f - 32));
		
		System.out.println(c);
		
		
		
	}

}
