package map;
import java.util.*;
public class DeleteAndEarn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,2,3,3,3,4};
		
		HashMap<Integer,Integer> m = new HashMap<>();
		
		int max = 0;
		
		Arrays.sort(nums);
		
		for(int x: nums)
			m.put(x, m.getOrDefault(x, 0)+1);
		
		m.entrySet();
		
		for(Map.Entry<Integer, Integer> e:m.entrySet())
		{
//			for(int i=nums.length-1;i>=0;i--)
//			{
//				max   = Math.min(max, )
//				
//			}
		}
		
		System.out.println(m.get(4));
		for(int i=nums.length-1;i>=0;i++) {
			
			
		}
			
		
		

	}

}
