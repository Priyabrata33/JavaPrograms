package practice2;

public class MaximumConsecutive1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] nums = {1,0,1,1,1,1,0,1};
		
		int count =0,res =0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0) {
				count =0;
				
			}
			else {
				count ++;
				res = Math.max(res, count);
			}
		}

		
		System.out.println(res);
	}

}
