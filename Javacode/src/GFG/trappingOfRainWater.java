package GFG;

public class trappingOfRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3, 0, 1, 2, 5};
		
		int ans = 0;
		for(int i=0;i<nums.length-1;i++) {
			int lMax =nums[i];
			
			for(int j=0;j<i;j++) {
				lMax = Math.max(lMax, nums[j]);
			}
			
			int rMax =nums[i];
			
			for(int j=i+1;j<nums.length;j++) {
				rMax = Math.max(rMax, nums[j]);
			}
			
			ans += (Math.min(rMax, lMax) - nums[i]);
		}
		
		System.out.println(ans);
		
	}
	

}
