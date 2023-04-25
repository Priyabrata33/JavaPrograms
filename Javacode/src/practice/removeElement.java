package practice;

import java.util.Arrays;

public class removeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] nums = {0,1,2,2,3,0,4,2};
			int val=2;
		
		
		
		 int count = 1;
	        for(int i=0;i<nums.length-1;i++){
	            if(nums[i]==val){
	                nums[i]=nums[i+1];
	                count++;
	            }
	        }
	        
	        System.out.println(count);
	        System.out.println(Arrays.toString(nums));
	}

}
