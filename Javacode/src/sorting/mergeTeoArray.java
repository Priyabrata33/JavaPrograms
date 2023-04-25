package sorting;
import java.util.*;

public class mergeTeoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  arr1  = {10,15,20};
		int[] arr2 = {5,6,6,15};
		int[] arr = new int[arr1.length+arr2.length];
		
		arr[0] = arr1[0];
		for(int i =1;i<arr1.length;i++) {
			if(arr[i-1]<arr[i]) {
				arr[i] = arr[i-1];
				arr[i-1] = arr1[i];
			}
			else
				arr[i] = arr1[i];
		}
		
		arr[arr1.length] = arr2[0];
		for(int i =1;i<arr2.length;i++) {
			if(arr[arr1.length-1]<arr[i]) {
				arr[arr1.length+i] = arr[arr1.length+i-1];
				arr[arr1.length+i-1] = arr2[i];
			}
			else
				arr[arr1.length+i] = arr2[i];
		}

		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
	}

}
