package sorting;

import java.util.Arrays;

public class selectionSort {

	public static void main(String[] args) {

		int[] arr = {100,54,65,321,2, 6,1,5,11,99};
		
		for(int i=0;i<arr.length;i++) {
			
			int min = i;
			
			for (int j=i+1;j<arr.length;j++) {
				
				if(arr[j]<arr[min]){
					
					min = j;
					
				}
			}
			int temp = arr[min];
			
				arr[min] =arr[i];
			
				arr[i] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
