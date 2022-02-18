package practice;

import java.util.Arrays;

public class selectionSort {

	public static void main(String[] args) {
		int[] arr = {24,23,531,5466,1345,6874,7};
		
		for(int i =0;i<arr.length;i++) {
			int min = i;
			for(int j= i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min = j;
					
				}
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
