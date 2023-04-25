package graph;

import java.util.Arrays;

public class CountUnreachablePairsofNodesinanUndirectedGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =7;
		int[][] ed = {{0,2},{0,5},{2,4},{1,6},{1,4}};
		
		
		Arrays.sort(ed); 

		System.out.println(Arrays.deepToString(ed));
	}

}
