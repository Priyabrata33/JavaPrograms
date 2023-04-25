package GFG;

public class triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] nums = {2,3,4,8,9,20,40};

		
		int x = 32;
		System.out.println(ans(nums,x));
		
		
	}
	
	public static boolean ans(int[] nums,int x) {

//		for(int i=0;i<nums.length;i++) {
//			for(int j=i+1;j<nums.length;j++) {
//				for(int k=j+2;k<nums.length;k++) {
//					if(nums[i]+nums[j]+nums[k]==x) {
//						return true;
//					}
//					
//					
//				}
//			}
//		}
		
		
		for(int i=0;i<nums.length;i++) {
			

			int left =i+1;
			int right = nums.length-1;
			
			while(left<=right) {
				if(nums[left]+nums[right]==x-nums[i])
					return true;
				
				else if(nums[left]+nums[right]>x-nums[i])
					right--;
				else if(nums[left]+nums[right]>x-nums[i])
					left++;
			}
			
			
			
		}
		return false;
		
	}

}
