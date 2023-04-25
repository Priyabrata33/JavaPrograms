package heap;
import java.util.*;

public class MaximumScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a = 1, b = 8, c = 8;
		PriorityQueue<Integer> pq = new  PriorityQueue<>(Collections.reverseOrder());
		
		pq.add(a);
		pq.add(b);
		pq.add(c);
		
		int sum  =0;
		
		while(pq.size()>=2) {
			System.out.println(pq);
			int fst = pq.poll();
			int sec = pq.poll();
			
			
				
				fst = fst-1;
				sec = sec-1;
				++sum;
				
			
			if(fst>0) pq.add(fst);
			if(sec>0) pq.add(sec);
			
			
			
			
		}
		
		System.out.println(sum);
	}

}
