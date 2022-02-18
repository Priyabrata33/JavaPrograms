package practice;

import java.util.Arrays;

public class contest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {5,3,6,1,12};
		int original = 3;
		
		Arrays.sort(nums);
		
		boolean check = binarySearch(nums,original);
        
        //System.out.println(check);
        
        while(check==true) {
        	original = 2*original;
        	check=binarySearch(nums,original);
        }
        System.out.println(original);
        
        
       
       
        
    }
    
	private static boolean binarySearch(int[] arr,int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			//find the middle element ------
			int mid = start + (end - start)/2;
			if(target==arr[mid]) {
				return true;
			}else if(target>arr[mid]) {
				start = mid +1;
			}else if (target<arr[mid]) {
				end = mid -1;
			}
		}
		return false;
	}
	
}


