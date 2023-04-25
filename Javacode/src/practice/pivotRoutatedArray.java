package practice;

public class pivotRoutatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {4,5,6,7,0,1,2};
		
		int target = 4;
		
		
		int ans = search(nums,target);
		//System.out.println(nums[ans]);
		
		
		
		
		
		

	}
	public static int search(int[] nums, int target) {
		int pivot = findPivot(nums);
		if(pivot == -1) {
			return binarySearch(nums,target,0,nums.length-1);
		}if(pivot==target) {
			return pivot;
		}if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
		return  binarySearch(nums, target, pivot + 1, nums.length - 1);
		
	}
	
	
	 public static int binarySearch(int[] nums,int target, int start, int end){
	        int mid =start + (end - start)/2;
	        while(start<=end){
	            if(target>nums[mid]){
	                start = mid+1;
	            }else if(target<nums[mid]){
	                end = mid-1;
	            }else{
	                return mid;
	            }
	            
	        }
	        return -1;
	    } 
	    
	
	   public static int findPivot(int[] nums){ //pivot where the changing occure here
	        int start = 0;
	        int end = nums.length-1;
	        
	        //there are 4cases happen here
	        while(start <= end){
	        int mid = start + (end-start)/2;
	        
	        if(mid < end && nums[mid] > nums[mid+1]){   //1.when mid element> mid+1 element we get mid as the PIVOT
	            return mid;
	            }
	        if(mid > start && nums[mid-1] > nums[mid]){  //2. if element mid-1 >element mid we get pivot as
	                
	                return mid-1;
	            }
	        if(nums[start] > nums[mid]){    
	            //3.when start element > mid element we dont need to check the letters are at the right are small than the mid so we need to check in the left hand of the mid here and we get the value here.....so end will change to the mid-1;
	                end = mid-1;
	            }
	        if(nums[start] <= nums[mid]){
	            
	            //here the start element is less then the mid that mean the pivot present after the mid element so we need to check after the mid element so start = mid +1;
	            
	                start = mid+1;
	            }
	            
	         }
	        return -1;
	    }

}
