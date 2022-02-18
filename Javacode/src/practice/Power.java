package practice;

import java.util.Arrays;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] queries = {
				{2,3,1},
				{4,3,1},
				{1,1,2}
				
				
					};
		int [][] points = {{1,3},{3,3},{5,3},{2,2} };
		
		int[] ans = new int[queries.length];
		
		
		
		for(int i=0;i<queries.length;i++) {
			
			int r2=queries[i][2]*queries[i][2];
			
			int count = 0;
			int t =0;
			
			 for(int j = 0;j<points.length;j++) {
				 
				 
				 int x2 = (Math.abs((queries[i][0]-points[j][0])*(queries[i][0]-points[j][0])));
				 int y2 = (Math.abs((queries[i][1]-points[j][1])*(queries[i][1]-points[j][1])));
				 
				 
				 if(x2+y2<=r2) {
					// System.out.println(x2 + " " +y2);
					 ++count;
					 t = x2+y2;
				 }
				 
				//System.out.println(r2);
			 }
			 
			
			 ans[i]= count;
		}
		
		System.out.println(Arrays.toString(ans));
			
		}

	}
	


