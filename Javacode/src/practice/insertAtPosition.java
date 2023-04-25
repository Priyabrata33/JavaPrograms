package practice;

import java.util.Arrays;

public class insertAtPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {5,10,20,0,0};
		int v=3;
		int pos =5;
		for(int i=nums.length-1;i>=pos;i--) {
			nums[i] = nums[i-1];
		}
		nums[pos-1] = v;
		System.out.println(Arrays.toString(nums));
	}
}
