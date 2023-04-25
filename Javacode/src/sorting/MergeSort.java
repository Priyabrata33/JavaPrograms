/*
 * Here I am doing merge sort
 * Assignment 1
 * 
 */
package sorting;

import java.util.Arrays;

public class MergeSort {
	
	//Main FUnction i.e. the starting of the function

	static int[] ans = new int[4];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] arr = {1,4,42,7};
	
		
		mergeSort(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(ans));
			
	}

	private static void mergeSort(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		if(r>l) {
			int mid = l+(r-l)/2;
			
			mergeSort(arr,l,mid);
			
			mergeSort(arr,mid+1,r);
			merge(arr,l,mid,r);
		}
		
	}
	
	

	private static void merge(int[] arr, int l, int mid, int r) {
		// TODO Auto-generated method stub
		
		int i =l,j=mid+1;
		
		int k = l;
		
		int n1 = mid-l+1;
		int n2 = r-mid;
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for (i = 0; i < n1; i++)
			L[i] = arr[l + i];
			for (j = 0; j < n2; j++)
			R[j] = arr[mid + 1+ j];
		
		while(i<n1 && j<n2) {
			if(L[i]<=R[j]) {
				ans[k] = L[i];
				i++;
			}
			else {
				ans[k] = R[j];
				j++;		
			}
			k++;
			
		}
		

		
		while(i<n1) {
			ans[k++] = L[i++]; 
			
		}while(j<n2) {
			ans[k++] =R[j++];
			
			
		}
		
	System.out.println(Arrays.toString(ans));	
	}
	
	

}
