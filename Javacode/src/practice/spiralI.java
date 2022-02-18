package practice;

import java.util.Arrays;

public class spiralI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = {{1,2,3},
				{4,5,6},
				{7,8,9}
				
		};
		int n = 4;
		
		int[][] ans = new int[n][n] ;
        
        
        int top =0;
        int bottom  = n-1;
        int left  = 0;
        int right = n-1;
        int count=1;
        
        while(left<=right && top <= bottom){
        	
        	for(int i = left;i<=right;i++ ){
                ans[left][i] = count++;
               }
            	top++;
            
            
            
        for(int i=top;i<=bottom;i++) {
  
        	ans[i][right]=count++;
       	}
//        
        right--;
//        
        for(int i=right;i>=left&&top<=bottom;i--) {
        	ans[bottom][i] = count++;
        }
       bottom--;
//        
////        
      for(int i = bottom;i>=top&&left<=right;i-- ) {
    	  ans[i][left]= count++;
      }
      left++;
	       
	}
        System.out.println(Arrays.deepToString(ans));

}}
	
