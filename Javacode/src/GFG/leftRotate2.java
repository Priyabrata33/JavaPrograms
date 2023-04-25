package GFG;

import java.util.Arrays;

public class leftRotate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] arr = {1,2,3,4,5};
		
		int d = 2;
		
		leftRotate(arr,d);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void leftRotate(int[] arr, int d) {
		int n = arr.length;
		int[] temp = new  int[d];
		
		for(int i = 0;i<d;i++) {
			temp[i] = arr[i];
			
		}
		
		System.out.println(Arrays.toString(temp));
		
		for(int i=d;i<arr.length;i++) {
			arr[i-d] = arr[i];	
			
		}
		
		for(int i =0;i<d;i++) {
			arr[n-d+i] = temp[i];
		}
	}

}
