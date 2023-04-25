package practice;
import java.util.*;

public class LuckyNumber1380 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
		

		 ArrayList<Integer> maxInCol = new ArrayList<>();
	        ArrayList<Integer> minInrow = new ArrayList<>();
	        ArrayList<Integer> list = new ArrayList<>();

	        
	        
     for(int i=0;i<matrix.length;i++){
    	 		
	            int row = 0, col =0;
	            int max = matrix[i][0];
	            
	            while(row<matrix[i].length){
	            	
	            	if(matrix[row][i]>max) {
	            		max = matrix[row][i];
	            		
	            	}
	            	 row++;
	            	}
	            maxInCol.add(max);
	                
	            }
     
     
     	
     for(int i=0;i<matrix.length;i++){
    	 
         int row = 0, col =0;
         int min = matrix[i][0];
         
         while(col<matrix[i].length){
         	
         	if(matrix[i][col]<min) {
         		min = matrix[i][col];
         		
         	}
         	
             col++;
         	
             	
             }
         minInrow.add(min);
         System.out.println(" ");
             
         }
	        
	        
	        
	        System.out.println(maxInCol);
	        System.out.println(minInrow);
	        
	        int j=0;
	        for(int i=0;i<maxInCol.size();i++) {
	        	
	       for(int k=0;k<minInrow.size();k++) {
	        	
	        	if(maxInCol.get(i)==minInrow.get(k)) {
	        		list.add(minInrow.get(k));
	        	}
	        
	        
	        }
	        }
	        
	        System.out.println(list);
		}  
	
	
	
	       // System.out.println(maxInCol);
		
	}


