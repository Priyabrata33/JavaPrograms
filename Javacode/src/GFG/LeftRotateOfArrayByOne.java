package GFG;

import java.util.Arrays;

public class LeftRotateOfArrayByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 3, 4, 5};
		leftRotate(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
	}
	
	public static void leftRotate(int[] arr) {
		
		
		int temp = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			arr[i-1] = arr[i];
		}
		
		arr[arr.length-1] = temp;
	}

}
