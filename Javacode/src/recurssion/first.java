package recurssion;

import java.util.ArrayList;
import java.util.Collections;

public class first {

	public static void main(String[] args) {
		
//		String str = "abbba";
//		
//		int start = 0 ; 
//		 int end = str.length()-1;
//		System.out.println(isPalindrome(str,start,end));
		//System.out.println(sum(101));
		
		
		
		subSet("abc","",0);
//		printN(7);
//		System.out.println();
//		System.out.println(fact(4));
		toh(4,'a','b','c');

	}
	
	private static int sum(int n) {
		// TODO Auto-generated method stub

		if(n==0)
			return 0;
		
		return  (n%10)+sum(n/10);
	}

	private static boolean isPalindrome(String str, int start, int end) {
		// TODO Auto-generated method stub
		
		if(start>=end)
			return true;
		
		if(str.charAt(end)!=str.charAt(start))
			return false;
		
		return isPalindrome(str,start+1,end-1);
		
		
		

		
	}

	public static int fun(int n) {
		if(n==1)
			return 1;
	
		return n+fun(n-1);
		
		
	}
	
	public static void subSet(String str,String cur,int i) {
		
		if(i==str.length()) {
			System.out.println(cur);
			return;
		}
		
		
		subSet(str,cur,i+1);
		
		subSet(str,cur+str.charAt(i),i+1);

		
		
	}
	public static void printN(int n) {
		if (n==0)
			return;
		
		System.out.print(n+ " ");
		printN(n-1);
		
		
	}
	public static int fact(int n) {
		if(n==0||n==1)
			return 1;
		
		return n*fact(n-1);
	}
	
	public static void toh(int n , char a, char b,char c) {
		if(n==1) {
			System.out.println("Move 1 from " + a +" to "+c );
			return;
		}
		toh(n-1,a,c,b);
		System.out.println("Move "+n+ " from "+ a+  " to "+ c);
		toh(n-1,b,a,c);
		
		
		ArrayList<Integer> ar = new ArrayList<>(10);
		Collections.fill(ar, -1);
		System.out.println(ar);
			
	}
	
	
	
	

}
