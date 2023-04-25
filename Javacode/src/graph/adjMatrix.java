package graph;
import java.util.*;
public class adjMatrix {

	static void addEdge(ArrayList<LinkedList<Integer>> adj,int u,int v) {
	
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int v = 4;
		
		ArrayList<LinkedList<Integer>> adj = new ArrayList<LinkedList<Integer>>();
		
		for(int i=0;i<v;i++)
			adj.add(new LinkedList<Integer>());
		
		
		
		addEdge(adj,0,1);
		addEdge(adj,0,2);
		addEdge(adj,1,2);
		addEdge(adj,1,3);
		int i = 0;
		for(var a:adj) {
			System.out.println(i++ +" "+a);
		}
		
		
		
	}

}
