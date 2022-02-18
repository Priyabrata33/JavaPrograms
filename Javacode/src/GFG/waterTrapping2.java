package GFG;

import java.util.Arrays;

public class waterTrapping2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
		int[] lMax = new int[nums.length];
		int[] rMax = new int[nums.length];
		
		lMax[0] = nums[0];
		
		for(int i=1;i<nums.length;i++) {
			lMax[i]= Math.max(lMax[i-1], nums[i]);
		}
		System.out.println(Arrays.toString(lMax));
		
		rMax[nums.length-1] = nums[nums.length-1];
		for(int i=nums.length-2;i>=0;i--) {
			rMax[i] = Math.max(nums[i], rMax[i+1]);
		}
		System.out.println(Arrays.toString(rMax));
		int ans =0;
		
		for(int i=0;i<nums.length;i++) {
		 ans = ans + Math.min(rMax[i],lMax[i]) - nums[i];
		}
		System.out.println(ans);
	}
}