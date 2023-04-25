package heap;

import java.util.*;

public class sortingBYMApAndPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {-1,1,-6,4,5,-6,1,4,1};
		
		
		 Map<Integer,Integer> hm = new HashMap<>();
	        for(var i:nums){
	            hm.put(i,hm.getOrDefault(i,0)+1);
	        }
	        
	        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(Collections.reverseOrder((a,b)->a.getValue()-b.getValue()));
	        for(var m:hm.entrySet()){
	            pq.add(m);
	        }
	        
	       
	        int count = 0 ;
	        
	        int n = pq.size();
	        
//	        for(int i = 0 ; i < n;i++) {
//	        	System.out.println(pq.peek().getKey()+" "+pq.poll().getValue()+" "+count++);
//	        }
	        
	        System.out.println(pq);
	        
	      for(int i = 0 ; i <n;i++) {
	    	  int ele = pq.peek().getKey();
	    	  int m = pq.poll().getValue();
	    	  
	    	  for(int j = 0 ; j<m;j++ ) {
	    		  nums[count++] = ele;
	    	  }
	    	 
	      }
	        
	        System.out.println(Arrays.toString(nums));
	}

}
