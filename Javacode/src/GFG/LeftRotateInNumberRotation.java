package GFG;

import java.util.Arrays;

public class LeftRotateInNumberRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		int d = 2;
		leftRotate(arr,d);
		System.out.println(Arrays.toString(arr));

	}

	
	
	public static void leftRotate(int[ ]  arr, int d)  {
		
		for(int i=0;i<d;i++) {
			leftRotateByOne(arr);
		}															//here we rotate things with our d time call the one left rotate with the d time to get the solution
		
	}
	
	public static void leftRotateByOne(int[] arr) {
		
		
		int temp = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			arr[i-1] = arr[i];
		}
		
		arr[arr.length-1] = temp;
	}

}
