package heap;
import java.util.*;
import java.util.Map.Entry;

public class freQuenntElements {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] nums = {1,1,1,2,2,3};
		int k =2;
		
		Map<Integer,Integer> ha = new HashMap<>();
		
		for(int i:nums) {
			ha.put(i, ha.getOrDefault(i, 0)+1);
		}
		
		System.out.println(ha);
		
		
		
		PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
				
				
				
				
				
				
				
//				new Comparator<Map.Entry<Integer,Integer>>() {
//
//			@Override
//			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
//				
//				return o1.getValue()-o2.getValue();
//			}
//			
//		});
		
		for(var m:ha.entrySet()) {
			pq.add(m);
			if(pq.size()>k)
				pq.poll();
		}
		
		System.out.println(pq.poll().getKey());
		System.out.println(pq.poll().getKey());
		 
			
		 
		
	}

}
