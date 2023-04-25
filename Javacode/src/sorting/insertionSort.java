package sorting;

import java.util.*;

public class insertionSort {
	public static void main(String[] args) {
//		int n;
		
//		Scanner sc = new Scanner (System.in);
//		
//		System.out.println("enter the element of the array : ");
//		n = sc.nextInt();
//		
//		int[] arr = new int[n];
//		
//		System.out.println("enter the elements of array: ");

		int[] arr = {12,11,13,5,6};
		
		int n =arr.length;
		
//		for(int i=0;i<n;i++) {
//			arr[i]= sc.nextInt();
//		}
//		
		for(int i = 1; i<n ;i++) {
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j] > key){
				
				arr[j+1] = arr[j];
				j=j-1;
				
			}
			arr[j+1] = key;
		}
		System.out.println(Arrays.toString(arr));
	}

}
