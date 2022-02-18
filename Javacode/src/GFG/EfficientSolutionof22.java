package GFG;

import java.util.Arrays;

public class EfficientSolutionof22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,3,-8,7,-1,2,3};
		int[] preSum = new int[nums.length];
		
		preSum[0]= nums[0];
		
		for(int i=1;i<nums.length;i++) {
			preSum[i] = Math.max(nums[i], preSum[i-1]+nums[i]);
	
		
		}
		
		System.out.println(Arrays.toString(preSum));
		
		int max = Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			if(preSum[i]> max) max = preSum[i];
		}
		
		
		System.out.println(max);
	}
	
	

}
