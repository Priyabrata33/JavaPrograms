package practice;
import java.util.*;

public class RemoveOneElementtoMaketheArrayStrictlyIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {541,783,433,744};
		int count=0;
		boolean ans = false;
		for(int i = 0 ;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]>=nums[j]) {
					count++;
				}
			}
		}
		
			
		
		
		ans = count>1?true:false;
		System.out.println(ans);
	       
	}

}
