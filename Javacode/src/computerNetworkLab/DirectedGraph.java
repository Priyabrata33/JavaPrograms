/**
 * @author chinmayasahu
 * @since 2022
 * @version 1.0
 * 
 * 
 */

package computerNetworkLab;
/**
 * @import from java.util  package
 * 
 */

import java.util.Arrays;
/**
 * @import java.util package
 */
import java.util.Scanner;


public class DirectedGraph {

	public static void main(String[] args) {
		

		Scanner sc =new Scanner (System.in);
		
		System.out.println("enter the number of vertices: ");
		int node = sc.nextInt();
		
		int n =1;
		int weight =0;
		
		
		int[][] mat = new int[node][node];
		
		int node1 = 0;
		int node2 = 0;
		
		while(node1>=0 && node2 >= 0) {
		
			System.out.println("enter the nodes " +n+ ":");
			
			node1 = sc.nextInt();
			node2 = sc.nextInt();
			
			if(node1==-1&&node2==-1)
				break;
			
			mat[node1-1][node2-1] = 1;
			
			
			n++;	
		}
		System.out.println("The outPut Matrix is");
		System.out.println(" 1  2  3  4  5  6  7  8  9  10");

		for(int[] i:mat) {
			System.out.println(Arrays.toString(i));
			System.out.println("\n");
		}
		
	}

}
