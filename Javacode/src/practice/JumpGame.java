package practice;

public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0};
		int jump =nums[0];
        boolean ans = false;
        
        
      int i = 0;
        while(i<=nums.length-1 && nums[i] !=0) {
        	i += jump; 
        	jump = nums[i];
        	
        	
        	if(i==nums.length-1) {
        		ans = true;
        		break;
        	}
        	System.out.println(i);
        }
     // System.out.println(i);
	   
      System.out.println(ans);
      
	}

}
