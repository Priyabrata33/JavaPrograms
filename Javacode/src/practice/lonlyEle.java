package practice;
import java.util.*;

public class lonlyEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10,6,5,8};
		
		List<Integer> li = new ArrayList<>();
       
        
		Arrays.sort(nums);
        
	    if(nums[0]+1!=nums[1])
	        li.add(nums[0]);
	        
	        
	        
	        
	        for(int i=1;i<nums.length-1;i++){
	            if(nums[i]-nums[i-1]>1 && nums[i+1]-nums[i]>1)
	                li.add(nums[i]);
	            
	        }
	      
	        if(nums[nums.length-1]-nums[nums.length-2]>1) {
	        	li.add(nums[nums.length-1]);
	        }
        
        
        System.out.println(li);

	}

}
