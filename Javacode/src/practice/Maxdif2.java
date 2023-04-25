package practice;

public class Maxdif2 {

	public static void main(String[] args) {
		int[] nums = {2, 3, 10, 6, 4, 8,15};
		
		System.out.println(maximumDifference(nums));
		
	}
	
	static int maximumDifference(int[] nums) {
		
		int max = Integer.MIN_VALUE;
		
		int minval = nums[0];
		
		for(int i = 1;i<nums.length;i++) {
			max = Math.max(max, nums[i]-minval);
			
			
			minval = Math.min(nums[i], minval);
		}
		
		return max;
	}
	

}
