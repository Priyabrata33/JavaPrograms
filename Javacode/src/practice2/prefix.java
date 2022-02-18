package practice2;

import java.util.Scanner;

public class prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int[] preSum = new int[n];
		
		for(int i=0;i<n;i++) {
			if(i==0) preSum[i]= arr[i];
			else preSum[i] = preSum[i-1]+arr[i];
		}
		
		int q = sc.nextInt();
		for(int i =0;i<q;i++) {
			int l =sc.nextInt();
			int r = sc.nextInt();
			
			if(l==0) System.out.println( preSum[r]);
			else System.out.println(preSum[r]-preSum[l-1]);
		}

	}

}
