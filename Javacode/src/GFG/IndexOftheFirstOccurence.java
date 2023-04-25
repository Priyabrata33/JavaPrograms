package GFG;

public class IndexOftheFirstOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {1,10,10,10,20, 20,30};
		int x = 20;
		int ans = Search(nums,0,nums.length-1,x);
		System.out.println(ans);
		
	}
	
	public static int Search(int[] nums,int start,int end,int x) {
		if(start>end) return -1;
		int actual = -1;
		int mid  = start+(end-start )/2;
		
		
		
		 if(x>nums[mid])
			return Search(nums,mid+1,end,x);
		else if(x<nums[mid])
			return Search(nums,start,mid+1,x);
		else{
			if(mid==0||nums[mid-1]!=nums[mid])
				return mid;
			else
				actual = Math.min(Search(nums,start,mid-1,x),mid);
			return actual;
		}
			
		//return -1;
	}

}
