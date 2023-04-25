package GFG;

public class Maximum1sInConsecutiveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 0, 1, 1, 1, 1, 0, 1};
		
		int res = resultOfArray(nums);
		System.out.println(res);
		

	}
	
	static int resultOfArray(int[] nums) {
		int res=0;
		
		for(int i=0;i<nums.length;i++) {
			
			int count = 0;
			
			for(int j=i;j<nums.length;j++) {
				
				if(nums[j]== 1) count++;
				
				else break;
					
				
			}
			
			res = Math.max(count, res);
		}
		return res;
	}

}
