package practice;

public class findLCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {12,15,3};
		int small = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			if(small>nums[i]) small = nums[i];
			else if(max<nums[i]) max = nums[i];
		}
		int ans = findLCM(small, max); 
		System.out.println(ans);
	}
	
	public static int findLCM(int small,int max) {
		int res = Math.max(small, max);
		int divisor =1;
		for(int i=2;i<small;i++ ) {
			 if(small%i==0 && max%i==0)
				 divisor=i;
		}
		System.out.println(divisor);
		while(true) {
			if(res%small==0 && res%max==0) break;
			
			res++;
		}
//		for(int i=2;i<small;i++ ) {
//			 if(small%i==0 && max%i==0)
//				 divisor=i;
//		}
//		System.out.println(divisor);
//		
//		
//	return (small*max)/divisor;
		
	return res;
	}
	
	

}
