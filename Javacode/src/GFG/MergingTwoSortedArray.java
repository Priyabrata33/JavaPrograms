package GFG;

import java.util.*;

public class MergingTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]  arr1  = {10,15,20};
		int[] arr2 = {5,6,6,15};
		int[] arr = new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length ; i++) {
			arr[i] = arr1[i];
			
		}
		for(int i=0;i<arr2.length ; i++) {
			arr[arr1.length+i] = arr2[i];
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));

	}

}
