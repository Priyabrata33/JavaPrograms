package heap;
import java.util.*;

class PAir{
	int[] ar;
	int dis;
	
	PAir(int[] ar){
		this.ar = ar;
		this.dis = ar[0]*ar[0] +ar[1]*ar[1] ;
	}
	
	
	public int[] getArray() {
		return ar;
	}
	public int getDis() {
		return dis; 
	}
}
public class KClosestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] points = {{9997,9997},{9996,9996}};
				
		int k = 1;
		 Collections.reverse(Arrays.asList(points));

		PriorityQueue<PAir> min = new PriorityQueue<PAir>(Collections.reverseOrder(new Comparator<PAir>() {

			@Override
			public int compare(PAir o1, PAir o2) {
				// TODO Auto-generated method stub
				return o1.getDis()-o2.getDis();
			}
			
		}));
		
		for(int[] ar : points) {
			min.add(new PAir(ar));
			
		}
		while(min.size()>k) min.remove();
		
	
		int[][] ans  = new int[k][];
		for(int i= 0;i<k;i++) {
			ans[i] = min.poll().getArray();
		}
		
		
		System.out.println(Arrays.deepToString(ans));
		
		
	}

}
