package practice2;

import java.util.Arrays;

public class leftrotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,-100,3,99};
		
		
	           leftRotate(nums);
	    
	
		System.out.println(Arrays.toString(nums));
		
			
	}

	private static int[] leftRotate(int[] nums) {
		// TODO Auto-generated method stub
		
		int temp = nums[0];
		for(int i =0;i<nums.length-1;i++) {
			nums[i+1] = nums[i];
		}
		
		nums[nums.length-1]  =temp;
		
		return nums;
	}
	
	
	

}


