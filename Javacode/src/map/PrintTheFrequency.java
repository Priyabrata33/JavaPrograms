package map;

import java.util.*;

public class PrintTheFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {10,12,10,15,10,20,12,12};
		
		
		
			
		for(int i=0;i<nums.length;i++) {
			int count =1;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count++;
					break;
				}
			}
			
			System.out.println(nums[i]+ " "+count);
		}
		

	}

}
