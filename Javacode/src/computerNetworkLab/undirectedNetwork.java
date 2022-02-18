package computerNetworkLab;

import java.util.*;

public class undirectedNetwork {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		
		System.out.println("enter the number of vertices: ");
		int node = sc.nextInt();
		
		int n =1;
		
		int[][] mat = new int[node][node];
		
		int node1 = 0;
		int node2 = 0;
		
		while(node1>=0 && node2 >= 0 && n<n*n/2) {
		
			System.out.println("enter the nodes " +n+ ":");
			
			node1 = sc.nextInt();
			node2 = sc.nextInt();
			
			if(node1==-1&&node2==-1)
				break;
			
			mat[node1-1][node2-1] = 1;
			mat[node2-1][node1-1] =1;
			
			n++;	
		}

		System.out.println(Arrays.deepToString(mat));

	}

}
