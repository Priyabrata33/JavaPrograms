package computerNetworkLab;

import java.util.*;


public class djastraAlgo {

	public static void main(String[] args) {

		Scanner sc =new Scanner (System.in);
		System.out.println("enter the number of vertices: ");
		int node = sc.nextInt();
		
		
		
		dijkstraSalgo(node,matForGraph(node),0);
		
		

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
	
	
	static void dijkstraSalgo(int node,int[][] graph,int src) {
		
		int[] dist = new  int[node];
		Boolean[] sptset = new Boolean[node];
		
		for (int i = 0; i < node; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptset[i] = false;
        }
		
		dist[src] = 0;
		
		//For shortest distance we call the function for the shortest path
		
		for(int count =0;count<node-1;count++) {
			
			int  u = minDistance (dist,sptset,node);
			
			sptset[u] = true;
			
			for(int v =0;v<node;v++) {
				if (!sptset[v] && graph[u][v] != 0 && 
		                   dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
		                    dist[v] = dist[u] + graph[u][v];
				}
			
			
			
			}
		
			printSolution(dist,node);
			
		}
	
	
	
	
	static int minDistance(int dist[], Boolean sptSet[],int node)
    {
        // Initialize min value
		
        int min = Integer.MAX_VALUE, min_index = -1;
  
        for (int v = 0; v < node; v++)
            if (sptSet[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }
  
        return min_index;
    }
		
		
		
		
		
	
	static void printSolution(int[] dist, int node) {
		System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < node; i++)
            System.out.println(i+ " to " + dist[i]);
		
	}


	
	

}
