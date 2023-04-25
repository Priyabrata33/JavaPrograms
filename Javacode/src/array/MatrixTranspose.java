package array;

import java.util.Arrays;

public class MatrixTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int c = mat[0].length;
		int r = mat[0].length;
		
		for(int i=0;i<mat.length;i++) {
			
			for(int j=i+1;j<mat[i].length;j++) {
				if(i==j) continue;
				else {
					int swap = mat[i][j];
					mat[i][j]= mat[j][i];
					mat[j][i] = swap;
				}
				
			}
			
		}
		System.out.println(Arrays.deepToString(mat));
		

	}

}
