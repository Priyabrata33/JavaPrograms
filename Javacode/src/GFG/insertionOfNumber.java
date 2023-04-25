package GFG;

import java.util.Arrays;

public class insertionOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int arr[] = new int[5], cap = 5, n = 3;

	       arr[0] = 5; arr[1] = 10; arr[2] = 20;

	       System.out.println("Before Insertion");

	       for(int i=0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }

	       System.out.println();

	       int x = 7, pos = 2;

	       n = insert(arr, n, x, cap, pos);

	       System.out.println("After Insertion");

	      System.out.println(Arrays.toString(arr));
		
		
		
		
	}

	private static int insert(int[] arr, int n, int x, int cap, int pos) {
		// TODO Auto-generated method stub
		
		if(cap==n) {
			return 0;
		}
		int ind = pos-1;
		for(int i= n-1;i>=ind;i--) {
			arr[i+1] = arr[i];
			
		}
		arr[ind] = x;
		
		return n+1;
	}

}
