package practice;
import java.util.*;

public class rephaseMatrix {

	public static void main(String[] args) {
		int[][] mat = {
						{1,2},
						{3,4}
					};
		int r=2,c=2;
		
		int[][] ans  = new int[r][c];
		
		 ArrayList<Integer> list = new ArrayList<>();
	        for(int i=0 ;i<mat.length;i++){
	            for(int j=0;j<mat[i].length;j++){
	            	
	            	
	                list.add(mat[i][j]);
	            }
	        }
	        System.out.println(list);
	        int row =0;
	        int col =0;
	        
	        for(int i=0 ;i<list.size();i++){
	            while(row<r){
	                ans[row][col] = list.get(i); 
	                row++;
	            }
	            
	            while(col<c) {
	            	ans[row][col] =list.get(i);
	            	col++;
	            }
	        }
	        System.out.println(Arrays.deepToString(ans));
	}

}
