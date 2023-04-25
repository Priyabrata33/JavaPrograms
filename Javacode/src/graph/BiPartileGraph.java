package graph;
import java.util.*;

class Node {
    int node;
    ArrayList<Integer> list;
    Node(int node,ArrayList<Integer> list){
        this.node = node ;
        this.list = list;
    }
}

public class BiPartileGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = {{1,2,3},{0,2},{0,1,3},{0,2}};
		
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		for(int[] i:nums) {
			
			ArrayList<Integer> con = new ArrayList<>();
			
			for(int j=0;j<i.length;j++) {
				con.add(i[j]);
			}
			
			
			adj.add(con);
		}
		
		
		
		
		int i=0;
		for(var a:adj)
		System.out.println(i++ +" "+ a);

	}

}
