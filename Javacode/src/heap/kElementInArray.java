package heap;
import java.util.*;

public class kElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = {6,5,3,2,8,10,9};
		
		PriorityQueue<Integer> minH = new PriorityQueue<>();
		
		
		int k = 3;
		
		PriorityQueue<Integer> maxH = new PriorityQueue<>(Collections.reverseOrder());
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i :ar) {
			minH.add(i);
			if(minH.size()>k)
				al.add(minH.poll());
		}
		for(Integer i: minH) {al.add(i);}
		
		System.out.println(al);
	
		Collections.reverse(al);
		System.out.println(al);
		
		
		
		
	}

}
