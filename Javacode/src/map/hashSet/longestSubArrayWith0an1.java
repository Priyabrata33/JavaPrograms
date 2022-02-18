package map.hashSet;

import java.util.HashMap;
import java.util.HashSet;

public class longestSubArrayWith0an1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int nums[] = {1,0,1,1,1,0,0}; 
				
		System.out.println(logestArray(nums));	
				
		
		
	}
	
	
	static int logestArray(int[] nums) {
		int res =0;
		int preSum = 0;
		
		HashMap<Integer,Integer> m = new HashMap<>();
		
		
		for(int i=0;i<nums.length;i++) {
			preSum += nums[i];
			
			if(preSum==0) res = Math.max(preSum, i+1);
			
			if(m.containsKey(0)!=false) { 
				m.put(preSum,i);
				//System.out.println(m);
				
			}
				
			
			
			if(m.containsKey(0))
				res = Math.max(res, i- m.get(0));
			
			
		}
		
		
		System.out.println(m);
		
		return res;
	}

}
