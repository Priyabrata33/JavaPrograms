package map.hashSet;
import java.util.*;

public class hash1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<Integer> h = new HashSet<>();
		
		h.add(9);
		h.add(50);
		h.add(8);
		System.out.println(h);
		
		System.out.println(h.size());
		System.out.println(h.contains(9));
		System.out.println(h.isEmpty());
		//h.clear();
		
		
		Iterator<Integer> i = h.iterator();
		
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
		System.out.println("\n");
		for(int m:h) {
			System.out.println(m+" ");
		}
	}

}
