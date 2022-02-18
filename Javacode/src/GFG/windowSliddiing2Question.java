package GFG;

public class windowSliddiing2Question {

	public static void main(String[] args) {

		//here must be the element in the array are no negative so that we use the window sliding technique otherwise we use the preSum or Hshing 
		
		int[] nums = {1,4,20,3,10,5};
		int givenSum = 33;
		int lastElement = 0;
		int firstElement =0;
		
		
		int checkSum = 0;
		
		
		for(int i =0;i<nums.length;i++) {
			checkSum += nums[i];
			lastElement = i;
			if(checkSum>givenSum) break;
		
		}
		
		
		
		for(int i=0;i<nums.length;i++) {
			checkSum -= nums[i]; 
			firstElement = i+1;
			if(checkSum==givenSum) break;
		}
		
		
	
		
		
		System.out.println(firstElement + " to " +lastElement);
		
		System.out.println(checkSum(nums,givenSum));

	}
	
	static boolean checkSum(int[] nums, int sum) {
		
		int s=0;
		int curSum = nums[0];
		for(int i=1;i<nums.length;i++) {
			
			while(curSum>sum && s<i-1) {
				curSum -=nums[s];
				s++;
			}
			
			if(curSum==sum)
				return true;
			
			//int i=1;
			if(i<nums.length)
				curSum+=nums[i];
		}
		
		
		
		
		return (curSum==sum);
	}

}
