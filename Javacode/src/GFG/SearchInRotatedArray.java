package GFG;

public class SearchInRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] nums = {3,1};
		int x = 1;
		
		System.out.println(search(nums,x));
		

	}
	
	public static int search(int[] nums,int x) {
		int start = 0;
		int end  = nums.length-1;
		
		while(start<=end) {
			int mid = start +(end - start)/2;
			
			if(nums[mid]==x) return mid;
				
			
			if(nums[start]<nums[mid]) {	
														//we check which half of the array is sorted     i.e. 1st half of the mid is sorted
					if(x>=nums[start] && x<nums[mid])
						end = mid-1;
					else 
						start= mid+1;
					
			}
			
			
			else {	//her right half of the array is sorted
				
				if(x>nums[mid] && x<=nums[end])
					start = mid+1;
				else 
					end = mid-1;
			}
		}
		
		return -1;
	}
	
	

}
