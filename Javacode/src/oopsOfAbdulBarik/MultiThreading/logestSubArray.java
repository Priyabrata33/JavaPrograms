package oopsOfAbdulBarik.MultiThreading;
import java.util.*;

public class logestSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {8,3,1,5,-6,6,2,2};
		int sum = 4;
		System.out.println(longSubArray(arr,sum));
	
		
	}
	static int longSubArray(int[] nums,int sum) {
		
		HashMap<Integer,Integer> m = new HashMap<>();
		
		int res =0;
		int preSum = 0;
		
		for(int i=0;i<nums.length;i++) {
			preSum += nums[i];
			
			if(preSum==sum)
				res = Math.max(preSum, i+1);
			
			if(m.containsKey(preSum)==false) {
				m.put(preSum,i);
				//System.out.println(m);
				
			}
				
			
			
			if(m.containsKey(preSum-sum))
				res = Math.max(res, i- m.get(preSum-sum));
			
			
		}
		
		
		System.out.println(m);
		
		return res;
	}

}
