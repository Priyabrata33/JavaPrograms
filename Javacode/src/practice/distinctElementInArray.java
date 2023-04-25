package practice;

import java.util.Arrays;
import java.util.HashSet;

public class distinctElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {10,10,5,3,20,5};
		
		int k=4;
		
		System.out.println(Arrays.toString(distinctElement(nums,k)));

	}

	
	static int[] distinctElement(int[] nums,int k) {
		
		int[] ans = new int[nums.length-k+1];
		
		for(int i=0;i<(nums.length-k)+1;i++) {
				
				HashSet<Integer> s = new HashSet<>();
				
				for(int j=i;j<=i+k-1;j++) {
					
					s.add(nums[j]);	
					
				}
		
				ans[i] = s.size();
				
			}
		
			return ans;
		}
	
	
}
