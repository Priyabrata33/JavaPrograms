package searching;

public class firstOccuranceoftheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] nums = {1,10,10,10,20,20,30};
		int target = 20;
		
		System.out.println(Search(nums,target));

	}

	
	public static int Search(int[] nums,int target) {
		int start =0;
		int end = nums.length-1;
		
		while(start<=end) {
			int mid = start + (end -start)/2;
			
			if(nums[mid]==target) {
				
				if(mid==0||nums[mid-1]!=nums[mid])
					return mid;
				else 
					end = mid-1;
			}
			else if(target >nums[mid]) 
				start = mid+1;
			else if(target<nums[mid])
				end = mid-1;
			
		}
		
		
		return -1;
		
		
}
	
}
