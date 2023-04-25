package practice;

import java.util.*;

public class OccuranceMorethenHAlf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {30,10,20,20,10,20,30,30};
		int k =4;
		occurance(nums,k);

	}
	
	static void occurance(int[] nums,int k) {
		
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		
		for(int x:nums) {
			m.put(x, m.getOrDefault(x, 0)+1);
		}
		
		
		for(Map.Entry<Integer, Integer> e:m.entrySet()) {
			if(e.getValue()>nums.length/k)
				System.out.print(e.getKey()+ " ");
		}
		
		
	}

}
