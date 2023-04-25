package GFG;

public class LeaderOfArray {

	public static void main(String[] args) {
		
		
		int[] nums = {7,4,10,6,5,2};
		
		leaderofArray(nums);
		
		
	}

	 static void leaderofArray(int[] nums) {
		// TODO Auto-generated method stub
		boolean flag = false;
		 for(int i = 0;i<nums.length;i++) {
			 for(int j= i+1;j<nums.length;j++) {
				 if(nums[i]<=nums[j]) {
					 flag = true;
					 break;
				 }
				 
			 }
			 
			 
			 if(flag = false) {
				 System.out.println(nums[i]);
			 }
		 }
		 
		
		 
		 
	}
	
	

}
