package map.hashSet;

import java.util.*;

public class SumOfSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {3,2,5,6};

		int sum = 10;
		System.out.println(sumOfSubArray(nums,sum));
		
	}
	
	static boolean sumOfSubArray(int[] nums,int sum) {
		
		int[] preSum = new int[nums.length];
		
		HashSet<Integer> s = new HashSet<Integer>();
		
		preSum[0]= nums[0];
		s.add(preSum[0]);
		
		for(int i=1;i<nums.length;i++) {
			preSum[i] = preSum[i-1]+nums[i];
			s.add(preSum[i]);
		}
		
		
		for(int i=0;i<nums.length;i++) {
			if(s.contains(preSum[i]-sum))
				return true;
			if(sum==preSum[i])
				return true; 
		}
			
		
		
		return false;
	}

}
