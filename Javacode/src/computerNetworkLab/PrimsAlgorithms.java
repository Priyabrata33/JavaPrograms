package computerNetworkLab;

import java.util.Arrays;
import java.util.Scanner;

public class PrimsAlgorithms {

	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner (System.in);
		System.out.println("enter the number of vertices: ");
		int node = sc.nextInt();
		
		
		MST(matForGraph(node),node);
		
		
		

	}
	
	
	static int[][] matForGraph(int node){
		
		Scanner sc =new Scanner (System.in);
		int n =1;
		

		
		int[][] mat = new int[node][node];
		
		int node1 = 0;
		int node2 = 0;
		
		while(node1>=0 && node2 >= 0) {
		
			System.out.println("enter the nodes " +n+ ":");
			
			node1 = sc.nextInt();
			node2 = sc.nextInt();
			
			
			if(node1==-1&&node2==-1)
				break;
			
			System.out.println("Enter the weight of the edge: ");
			int weight = sc.nextInt();
			mat[node1-1][node2-1] = weight;
			mat[node2-1][node1-1] = weight;
			
			n++;	
		}
		return mat;
	}
	
	static void MST(int[][] graph, int node) {
		int[] parent  = new int[node];	//for visiting
		int key[] = new int[node];			//for minimum weight
		Boolean mstSet[] = new Boolean[node];
		
		for (int i = 0; i < node; i++) {
            parent[i] = -1;
            mstSet[i] = false;
            key[i] = Integer.MAX_VALUE;
        }
		
		key[0] = 0;
		parent[0] = -1;
		
		
		for(int x =0;x<node-1;x++) {
			int u = min_key(key,mstSet,node);
			
			mstSet[u] = true;
			
			for(int v =0;v<node;v++) {
				if(graph[u][v]!=0&&mstSet[v]==false && graph[u][v]<key[v]) {
					parent[v] = u;
					key[v] = graph[u][v];
				}
			}
		}
		
		print_MST(parent,graph,node);
	}


	static void print_MST(int[] parent, int[][] graph, int node) {
		
		int minCost = 0;
		System.out.println("Edge \tWeight\n");
		for(int i =1;i<node;i++) {
			System.out.println(parent[i]+ " - " + graph[i][parent[i]]);
			minCost += graph[i][parent[i]];
		}
		
		System.out.println("Total cost is " + minCost);
		
		
	}


	static int min_key(int[] key, Boolean[] mstSet, int node) {

		int min = 999,min_index = 0;
		
		for(int v =0;v<node;v++) {
			if(mstSet[v]==false && key[v]<min) {
				min = key[v];
				min_index = v;
			}
		}
		return min_index;
	}
	
	
}

