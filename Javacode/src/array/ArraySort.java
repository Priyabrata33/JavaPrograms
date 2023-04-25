package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Order of Array");
		int n = sc.nextInt();
		
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		int[] arr3 = new int[n];
		
		System.out.println("enter the elements of array");
		
		
		for(int i = 0;i<n;i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr1));
			
			
			
		for (int i = 0;i<n;i++) {
			if(arr1[i]%2 ==0) {
				arr2[i] =arr1[i];
			}else
				arr3[i] = arr1[i];
		}
		
		System.out.println("EVEN ARRAY : " +Arrays.toString(arr2));
		System.out.println("ODD ARRAY : " +Arrays.toString(arr3));
		
	}

}
