package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTWO_D {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = 0;
		int b =1;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for(int i = 0;i<n-2;i++) {
			int temp = a+b;
			System.out.print(temp+ " ");
			a=b;
			b=temp;
		}
		
		
	}
	

}
