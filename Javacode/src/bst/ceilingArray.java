package bst;

import java.util.*;
public class ceilingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {2,8,30,15,25,12};
		int[] ans = new int[ar.length];
		
		TreeSet<Integer> t = new TreeSet<Integer>();
		
		for (int i=0;i<ar.length;i++) {
			Integer greater = t.ceiling(ar[i]);
			
			if(greater==null)
				ans[i] = -1;
			else
				ans[i] = greater;
			
			t.add(ar[i]);
		}
		
		System.out.println(t.higher(ar[4]));
		
		
		
		System.out.println(t);
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.toString(ans));
	}

}
