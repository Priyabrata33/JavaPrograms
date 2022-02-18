package oops;

import java.util.Arrays;

public class lll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] rectangles = {{5,8},{3,9},{5,12},{16,5}};
		
		 int n = rectangles.length;
	        int[] arr =new int[n];
	        int maxLen =0;
	        int num =0;
	        
	        for(int i =0;i<rectangles.length;i++){
	            int j=0;
	                arr[i] = Math.min(rectangles[i][j],rectangles[i][j+1]);
	            
	                if(maxLen==arr[i])
	                   num++;
	                else if(arr[i]>maxLen){
	                    num =1;
	                    num++;
	                }
	            
	                
	            
	            }
	        
	        System.out.println(num);
	        
	        
	        
	        
	            
	            
	            	   
	            
	            
	        
	        
	        System.out.println(maxLen);
	        System.out.println(Arrays.toString(arr));
	   }
}


