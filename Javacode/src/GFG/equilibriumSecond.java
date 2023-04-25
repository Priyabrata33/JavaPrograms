package GFG;

public class equilibriumSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1,2,3,4,6};
		boolean ans = equilibrium(nums);
		
		System.out.println(ans);
		
	}
	
	static boolean equilibrium(int[] nums) {
		int totalSum = 0;
		
		for(int i = 0 ; i<nums.length;i++) {
			totalSum += nums[i];
			
			
		}
		
		System.out.println(totalSum);
		int lsum = 0;
		
		for(int i = 0;i<nums.length;i++) {
			
			
			if(lsum==totalSum-nums[i]) 
				return true;	
			lsum = lsum + nums[i];
			totalSum = totalSum-nums[i];
				
			
		}
		
		
		return false;
	}

}
