package GFG;

import java.util.Arrays;

public class prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[]  arr = {1,2,3,4,5,6,7,8,9};

		prefixSumArray(arr);

	}
	
	static void prefixSumArray(int[] nums) {
		
		int[] sumArray = new int[nums.length];
		sumArray[0] = nums[0];
		for(int i = 1; i<nums.length;i++) {
			sumArray[i] =sumArray[i-1] + nums[i]; 
		}
		
		System.out.println(Arrays.toString(sumArray));
		
		
	}


}
