package practice;

import java.util.HashSet;

public class containsPreFixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr  = {15,2,8,10,-5,-8,6};
		
		HashSet<Integer> hs = new HashSet<>();
		int preSum =0;
		int sum = 2;
		boolean ans = false;
		
		for(int i:arr) {
			
			preSum  += i;
			
			if(preSum==sum) {
				ans = true;
				break;
			
			}
			else if(hs.contains(preSum-sum)) {
				ans =true;
				break;
			}
			hs.add(preSum);
		}
		System.out.println(ans);

	}

}
