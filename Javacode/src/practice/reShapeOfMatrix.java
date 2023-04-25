package practice;
import java.util.*;

public class reShapeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r=2,c=4;
		int[][] mat = {
				{1,2},
				{3,4},
				{6,7},
				{8,9}
		};
		
		
			
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0 ;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                list.add(mat[i][j]);
            }
        }
        int k=0;
        System.out.println(list.size());
        System.out.println(r*c);
        
        if(list.size()!=r*c){
        	int[][] ans = new int[mat.length][mat[0].length];
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[i].length;j++){
                    ans[i][j] = mat[i][j];
                }
            }
            System.out.println(Arrays.deepToString(ans));
        }
        else{
        	int[][] ans = new int[r][c];
        for(int i=0 ;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j] = list.get(k);
                k++;
            }
        }
        System.out.println(Arrays.deepToString(ans));
       }
       
	}

}
