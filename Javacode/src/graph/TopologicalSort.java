package graph;

import java.util.*;

public class TopologicalSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] nums = {{},{},{3},{1},{0,1},{0,2}};
		
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		for(int[] i:nums) {
			
			ArrayList<Integer> con = new ArrayList<>();
			
			for(int j=0;j<i.length;j++) {
				con.add(i[j]);
			}
			adj.add(con);
		}
		
		
		
		
		Stack<Integer> st = new Stack<>();
		
		boolean[] vis = new boolean[nums.length];
		
		for(int i=0;i<vis.length;i++) {
			if (vis[i]==false) {
				DFSCheck(adj,i,vis,st);
			}
		}
		
		int[] ans = new int[vis.length];
		int i=0;
		while(st.isEmpty()!=true) {
			ans[i++] = st.pop();
		}
		
		System.out.println(Arrays.toString(ans));
		
		

	}

	private static void DFSCheck(ArrayList<ArrayList<Integer>> adj, int node, boolean[] vis, Stack<Integer> st) {
		// TODO Auto-generated method stub
		
		vis[node] = true;
		
		for(Integer it:adj.get(node)) {
			if(vis[it]==false) {
				DFSCheck(adj,it,vis,st);
			}
			
		}
		
		st.push(node);
	}

}
