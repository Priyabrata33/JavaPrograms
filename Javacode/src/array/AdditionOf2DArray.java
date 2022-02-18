 package array;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionOf2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number of element in the array : ");
		int n = sc.nextInt();
		
		int[] arr1 = new int[n];
		
		System.out.println("Enter the eliment of the ARRAY 1 : ");
		for (int i=0 ; i<n; i++) {
			for(int j=0; j<n; j++) {
				 arr1[j] =sc.nextInt(); 
			}
			
		}
		
		System.out.println(Arrays.toString(arr1));
		
		

	}

}
