package practice;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] nums = {1,1,1,2,3,4};
			boolean ans  =false;
			for(int i  = 0;i<nums.length;i++) {
				for(int j = 0;j<nums.length;j++) {
					
					if(nums[i] == nums[j]) {
						ans =true;
						break;
					}else {
						ans = false;
						break;
					}
				}
			}
			
			System.out.println(ans);
			System.out.println(nums.length);
			Arrays.sort(nums);
			System.out.println(Arrays.toString(nums));
	}

}
