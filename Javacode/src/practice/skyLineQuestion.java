package practice;

public class skyLineQuestion {
	
	public static void main(String args[]) {
		
		int[][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
		int sum = 0;
		
		
		for(int i=0;i<grid.length;i++){
			for(int j =0;j<grid[i].length;j++) {
				
				
		          int row = 0,col =0;
		          int rmax = grid[i][row],cmax = grid[col][j] ;
		          
		          while(row<grid[i].length) {
		        	  
		        	  rmax = Math.max(rmax, grid[i][row]);
		        	  row++;
		          }
		          while(col<grid[i].length) {
		        	  cmax = Math.max(cmax, grid[col][j]);
		        	  col++;
		          }
		         
		          sum += Math.min(rmax, cmax) - grid[i][j]; 
		          
		          
			}
		          
	      }
		
		System.out.println(sum);
	        
	       
	}

}
