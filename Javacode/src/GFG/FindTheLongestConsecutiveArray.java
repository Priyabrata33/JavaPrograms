package GFG;

import java.util.HashSet;

public class FindTheLongestConsecutiveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {3,8,7,4,5};
		System.out.println(longestSubArray(nums));

	}
	
	public static int longestSubArray(int[] nums) {
		int res =0;
		HashSet<Integer> s = new HashSet<Integer>();
		
		for(int i=0;i<nums.length;i++) {
			s.add(nums[i]);	
		}
		
		for(int i=0;i<nums.length;i++) {
			
			int cur = 1;
			
			if(s.contains(nums[i]-1)==false)
				cur=1;
			
			while(s.contains(nums[i]+cur)) {
				//System.out.println(cur+ " "+ res);
				cur++;
				}
			
			res = Math.max(cur,res);
			
		}
		return res;
	}

}
