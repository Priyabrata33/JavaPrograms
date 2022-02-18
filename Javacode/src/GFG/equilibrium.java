package GFG;

public class equilibrium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 2,-2};
		int ans =0;
		
		for(int i = 0;i<nums.length;i++) {
			
			int lsum = equilibrium(nums,0,i-1);
			int rsum = equilibrium(nums,i+1,nums.length-1);
			
			
			if(lsum == rsum ) {
				ans =i;
			}
		}
		System.out.println(ans);

	}

	
	static int equilibrium(int[] nums,int start,int end) {
		int sum = 0;
		for(int i = start;i<=end;i++) {
			sum = sum +nums[i];
		}
		return sum;
	}
}
