package practice;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,3,5,6};
		int target = 2;
		int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid  = start + (end-start)/2;
            if(nums[mid]>target){
                end = mid-1;
            }else if(nums[mid]<target){
                start = mid+1;
            }else
                System.out.println(mid);
        }
        
        System.out.println(start);
	}

}
