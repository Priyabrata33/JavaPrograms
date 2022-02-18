package map.hashSet;
import java.util.*;

public class printFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {10,10,20,10,30};
		Map<Integer,Integer> m = new HashMap<>();
		//int key =1;
		
		//m.put(key,nums[0]);
	
		for(int i: nums) {
			m.put(i, m.getOrDefault(i, 0)+1);
			
			//System.out.println(i);
		}
		
		for(Map.Entry<Integer, Integer> e:m.entrySet()) {
			System.out.println(e.getKey()+ " "+ e.getValue());
		}

	}

}
