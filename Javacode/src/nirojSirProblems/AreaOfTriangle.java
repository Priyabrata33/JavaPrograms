package nirojSirProblems;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the height : ");
		int height = sc.nextInt();
		
		System.out.print("Enter the Base : ");
		int base = sc.nextInt();
		
		
		float area = (float)(height * base)/2;
		System.out.println("Area : " +area);
		
		
		
		
	}

}
