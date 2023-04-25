package practice;

public class maximumDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] nums = {2, 3, 10, 6, 4, 8,15};
		
		System.out.println(maximumDifference(nums));
	}
	static int maximumDifference(int[] nums) {
		
		int max = Integer.MIN_VALUE;
		int dif = 0;
		
		for(int i = 0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				 max = Math.max(max, nums[j]-nums[i]);
			}
			
		}
		
		return max;
	}

}
