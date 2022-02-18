package array;

import java.util.Arrays;

public class ArrayWithFunction {

	public static void main(String[] args) {
		// 
			int arr[] = { 1,2,3,4,5,6};
			
			System.out.println(Arrays.toString(arr));
			
			
			System.out.println("after changing the Array");
			
			
			change(arr);
			
			
			
			System.out.println(Arrays.toString(arr));
			
			
 	}
	
	static void change(int[] arr) {
		arr[1] = 90;
	}

}
