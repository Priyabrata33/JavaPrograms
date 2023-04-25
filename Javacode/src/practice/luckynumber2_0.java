package practice;
import java.util.*;

public class luckynumber2_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
		
		 ArrayList<Integer> minInRow = new ArrayList<>();
		    ArrayList<Integer> maxInCol = new ArrayList<>();
		    
		    
		    
		    
		        for(int row=0;row<matrix.length;row++){
		        	
		        	int min = Integer.MAX_VALUE;
		            
		            int   col =0;
		            
		            while(col<matrix[row].length){
		                
		                if(matrix[row][col]<min){
		                    min = matrix[row][col]; 
		                }
		                
		                col++;
		            }
		            minInRow.add(min);
		            
		        }
		        
		        System.out.println(minInRow);
		        
		        
		        
		        for(int col=0;col<matrix[0].length;col++) {
		        	
		        	int max = Integer.MIN_VALUE;
		        	
		        	int row= 0;
		        	
		        	while(row<matrix.length) {
		        		
		        		if(matrix[row][col]>max) {
		        			max =matrix[row][col];
		        		}
		        		row++;
		        		
		        	}
		        	maxInCol.add(max);
		        }
		        System.out.println(maxInCol);
		        
		        List<Integer> common = new ArrayList<Integer>(minInRow);
		        common.retainAll(maxInCol);
		        
		        System.out.println(common);
		        
		        
	}

}
