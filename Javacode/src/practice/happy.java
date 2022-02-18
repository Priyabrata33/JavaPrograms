package practice;
import java.util.*;
public class happy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {4,4,4,3};
		
		
		Arrays.sort(nums);
		
		if(nums[0]==nums[nums.length-1])
			System.out.println(0);
		else if(nums.length==1)
			System.out.println(1);
		else {
			int max = nums[nums.length-1];
			
			int left =0;
			int right =1;
			
		}
		
	}

}
