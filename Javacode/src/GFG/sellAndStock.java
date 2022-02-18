package GFG;

public class sellAndStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,5,3,8,12};
		int start = 0;
		int end = nums.length-1;
		
		int ans = maxProfit(nums,start,end);
		System.out.println(ans);

	}
	
	static int maxProfit(int[] nums, int start, int end) {
		if(end<=start)
			return 0;
		
		int profit =0;
		
		for(int i= 0;i<end;i++) {
			
			for(int j=i+1;j<=end;j++) {
				
				if(nums[j]>nums[i]) {
					
					int curProfit = nums[j]-nums[i] + maxProfit(nums,start,i-1)+maxProfit(nums,j+1,end);
					
					profit = Math.max(curProfit, profit);
				}
						
			}
		}
		
		return profit;
	}

}
