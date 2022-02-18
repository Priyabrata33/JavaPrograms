package GFG;

import java.util.Arrays;

public class SieveofEratosthenes {

	public static void main(String[] args) {
		//print all the prime upto the number
		
		int n = 23 ;
		boolean[] arr = new boolean[n];
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=2;i<n;i++) {
			
			for(int j =2;j*j<=n;j++) {
			if(i%j==0)
				arr[i]=true;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
	}

}
