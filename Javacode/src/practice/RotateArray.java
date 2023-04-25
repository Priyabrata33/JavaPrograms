package practice;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {-1};
		int  k =2;
		
		k = k%nums.length;
		
		rightRotate(nums,nums.length-1,0);
		rightRotate(nums,k-1, 0);
		
		
		rightRotate(nums,nums.length-1,k);
		//System.out.println(Arrays.toString(nums));

		
		
		//System.out.println(Arrays.toString(nums));

		
		
		//System.out.println(Arrays.toString(nums));

		
			
		System.out.println(Arrays.toString(nums));
	}
	
	public static void rightRotate(int[] nums, int high, int low) {
		while(low<high) {
			int temp = nums[low];
			nums[low] = nums[high];
			nums[high] = temp;
			low++;
			high--;
		}
	}

}
