package dynamicProgramming;

import java.util.Arrays;

public class FibonaciNumber {
	
	 static int[] mem = new  int[6];
	 		
	public static void main(String[] args) {
		
		Arrays.fill(mem, -1);
		
		int res = fibo(5);
		System.out.println(res);
		System.out.println(Arrays.toString(mem));
		
	}
	
	
	
	public static int fibo(int n) {
		
		
		if(mem[n]==-1) {
			
			int res = 0;
			
			if(n==0 || n==1) 					//recursive solution is a memoization // where as the bottom up approach is a tabulation problem  
				res = n;
			
			else
				res = fibo(n-1) + fibo(n-2);
			
			mem[n] = res;
				
			
		}
		
		return mem[n];
			
		
	}
	
	
	//Bottom Up approach is a tabulation approach
	
	
	public static int[] fiboT(int n) {
		int[] mem = new int[n+1];
		
		mem[0] = 0;
		mem[1] = 1;
		
		for(int i =2;i<n;i++) {
			mem[i] = mem[i-1]+mem[i-2];
		}
		
		return mem;
	}
	
	
	
}
