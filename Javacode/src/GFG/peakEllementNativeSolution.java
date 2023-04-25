package GFG;

public class peakEllementNativeSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] nums = {20,15,7,50,8,90};
		
		
		if(nums[0]>nums[1])
			System.out.println(nums[0]);
		
		
		 if(nums[nums.length-2]<nums[nums.length-1])
			System.out.println(nums[nums.length-1]);
		
		
		
		for(int i=1;i<nums.length-1;i++) {
			
				if(nums[i]>=nums[i-1]&&nums[i]>=nums[i+1]) {
					System.out.println(nums[i]);
					break;
				}
				
				
			}
		}

	

}
