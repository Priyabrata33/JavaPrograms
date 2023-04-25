package greedy;
import java.util.*;

class City{
	int c1;int c2;
	City(int c1,int c2){
		this.c1 = c1;
		this.c2 = c2;
	}
}



public class TwoCityShceduling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] city = {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
		
//		Arrays.sort(city, (a,b)->{
//			return a[0]-b[0];
//		});
		
		PriorityQueue<City> pq = new PriorityQueue<>((a,b)->a.c1-b.c1);
		
		for(int i=0;i<city.length;i++) {
			pq.add(new City(city[i][0],city[i][1]));
		}
		
		
		PriorityQueue<City> pq2 = new PriorityQueue<>((a,b)->a.c2-b.c2);
		
		for(int i=0;i<city.length;i++) {
			pq2.add(new City(city[i][0],city[i][1]));
		}
		
	
		int ans =0;
		for(int i=0;i<city.length/2-1;i++) {
			ans+=pq.poll().c1 + pq2.poll().c2; 
		}
		
		while(pq.isEmpty()!=true) {
			System.out.println(pq.peek().c1+" "+pq.poll().c2);
			
		}
		System.out.println();
		while(pq2.isEmpty()!=true) {
			System.out.println(pq2.peek().c1+" "+pq2.poll().c2);
			
		}
		
//		ans += Math.min(pq.poll().c1, pq2.poll().c1);
//		ans += Math.min(pq.poll().c2, pq2.poll().c2);
		
		System.out.println();
		System.out.println(ans);
		
	}

}
