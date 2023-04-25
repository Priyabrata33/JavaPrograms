package practice;

public class MaximumConsiCutiveIn1sArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,0,1,1,1,1,0,1};
		int ans=ans(nums);
		System.out.println(ans);

	}
	
	
	public static int ans(int[] nums) {
		int count =0;
		int ans=0;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]==1) {
				count = 1;
				for(int j=i+1;j<nums.length;j++) {
					if(nums[i]==nums[j]) {
						count++;
						//if(ans<count) ans = count;
					}
					else {
						//if(ans<count) ans =count ;
						break;
					}
					if(ans<count) ans =count;
				}
				
			}
		}
		return ans;
	}

}
