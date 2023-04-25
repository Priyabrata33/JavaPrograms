package practice;

public class numberWithEvenInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int[]	nums = {12,345,2,6,7896};
		
		 		int count =0;
		 		int target =0;
	        for(int i=0;i<nums.length;i++){
	            while(nums[i] > 0){
	                count ++;
	                nums[i] = nums[i] / 10;
	                
	            }
	            if(count %2 == 0){
	                target++;
	            }
	        }
	        
	        System.out.println(target);

	}

}
