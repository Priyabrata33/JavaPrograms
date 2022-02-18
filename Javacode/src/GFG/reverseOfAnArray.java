package GFG;

import java.util.Arrays;

public class reverseOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10, 5, 6, 7, 30};
		
		int n = arr.length;
		
		
		 reverse(arr, n);
		 
		System.out.println(Arrays.toString(arr));
		
		
	}
	public static void reverse (int[] arr, int n) {
		int low = 0;
		int high = n-1;
		
		while(low<high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
			
		}
		
	}

}
