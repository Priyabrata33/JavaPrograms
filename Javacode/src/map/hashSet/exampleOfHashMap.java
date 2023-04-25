package map.hashSet;
import java.util.*;
import java.util.Map.Entry;

public class exampleOfHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<Integer,Integer> m = new HashMap<>();
		
		m.put(1, 20);
		m.put(2, 30);
		
		//m.put(null, null)
		
		System.out.println(m);
		System.out.println(m.getOrDefault(3, 0)+1);
		
		for(Map.Entry<Integer, Integer> e:m.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		

	}

} 
