package GFG;

public class TwoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,4,8,9,11,12,20,30};
		int x = 23;
		System.out.println(twoPointer(nums,x));

	}
	
	
	public static boolean twoPointer(int[] nums,int x) {
		int left = 0;
		int right = nums.length-1;
		while(left<right) {
			if(nums[left]+nums[right]==x)
				return true;
			else if(nums[left]+nums[right]>x)
				right--;
			else if(nums[left]+nums[right]<x)
				left++;
		}
		return false;
	}

}
