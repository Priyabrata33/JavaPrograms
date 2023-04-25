package GFG;

public class MaximumSumOfSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,3,-8,7,-1,2,3};
		//int[] preSum = new int[nums.length];
		
		int sum =nums[0];
		for(int i =0;i<nums.length-1;i++) {
			int cur = 0;
			for(int j=i;j<nums.length;j++) {
				cur = cur+nums[j];
				sum  = Math.max(cur, sum);
			}
			
			
		}
		
		System.out.println(sum);
		
		
	}

}
