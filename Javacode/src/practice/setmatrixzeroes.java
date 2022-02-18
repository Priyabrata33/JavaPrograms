package practice;
import java.util.*;

public class setmatrixzeroes {

	public static void main(String[] args) {
		int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		
		List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        System.out.println(row);
        System.out.println(col);
        	int j=0;
       while(j<row.size()) {
        for(int i=0;i<matrix[0].length;i++) {
        	matrix[row.get(j)][i]=0;
        }
        j++;
       }
       
       
       
       int k=0;
       while(k<col.size()) {
        for(int i=0;i<matrix.length;i++) {
        	matrix[i][col.get(k)]=0;
        }
        k++;
       }
        
        
        System.out.println(Arrays.deepToString(matrix));
        
	}

}
