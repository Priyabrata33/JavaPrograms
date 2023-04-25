package searching;

public class countInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,10,10,10,20,20,20,30};
		int target = 10;
		
		System.out.println(Search(nums,0,nums.length-1,target));


	}
	public static int Search(int[] nums,int start,int end,int target) {
//		int start =0;
//		int end = nums.length-1;
		int count =0;
		
		while(start<=end) {
			int mid = start + (end -start)/2;
			
			if(nums[mid]==target) {
				count++;
					if(mid!=0 && nums[mid-1]==target)
						Search(nums,0,mid-1,target);
					else if(mid!=nums.length-1 && nums[mid+1]==nums[mid])
						Search(nums,mid+1,end,target);
			}
			else if(target >nums[mid]) 
				start = mid+1;
			else if(target<nums[mid])
				end = mid-1;
			
		}
		
		
		return count;
	}
		

}
