package practice;

import java.util.*;

public class contest5982 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,0,4,5,-11};
		int pivot =5;
		
		int[] ans = new int[nums.length] ;
	       List<Integer> great = new ArrayList<>();
	        
	        for(int i=0;i<nums.length;i++){
	            
	            if(nums[i]>pivot)
	            	great.add(nums[i]);
	        }
	        
	       // System.out.println(great);
	        
	         List<Integer> less = new ArrayList<>();
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]<pivot)
	                less.add(nums[i]);
	        }
	        List<Integer> eq = new ArrayList<>();
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]==pivot)
	                eq.add(nums[i]);
	        }
	        
	        System.out.println(less);
	        System.out.println(eq);
	        System.out.println(great);
	        System.out.println(nums.length-less.size()-1);
	        
	        if(less.size()!=0) {
	        for(int i=0;i<less.size();i++){
	            ans[i] = less.get(i);
	        }
	        }
	        if(eq.size()!=0) {
	        for(int i=0;i<nums.length-less.size()-2;i++) {
	        	
	        	ans[less.size()+i]=eq.get(i);
	        }
	        }
	        System.out.println(nums.length-less.size()-eq.size());
	        
	        if(great.size()!=0) {
	        
	        for(int i=0;i<nums.length-less.size()-eq.size();i++) {
	        	
	        	ans[less.size()+eq.size()+i]=great.get(i);
	        }
	        }
//	        System.out.println(Arrays.toString(ans));  
//	        System.out.println(less.size());
	        
	        
	        System.out.println(less);
	        System.out.println(eq);
	        System.out.println(great);
//	        for(int i=less.size();i<=nums.length-1;i++){
//	            ans[i] = great.get(i);
//	        }
	        
	        
	      System.out.println(Arrays.toString(ans));  
	}

}
