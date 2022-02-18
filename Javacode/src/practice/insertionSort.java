package practice;

import java.util.Arrays;

public class insertionSort {

	public static void main(String[] args) {
		
		int[] a = {12,43,5,1,66,87,56};
		
		for(int i=0;i<a.length;i++){
			
			int key = a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {
				
				a[j+1]=a[j];
				j--;
			}
			
			a[j+1]=key;
			
		}
		System.out.println(Arrays.toString(a));

	}

}
