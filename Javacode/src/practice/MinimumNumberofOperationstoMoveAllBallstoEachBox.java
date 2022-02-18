package practice;
import java.util.*;
public class MinimumNumberofOperationstoMoveAllBallstoEachBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String boxes = "001011";
		 int[] ans = new int[boxes.length()];
		 
	        
	        for(int i=0;i<boxes.length();i++){
	        	int sum =0;
	           //if(boxes.charAt(i)=='0'){
	                for(int j=0;j<boxes.length();j++) {
	                	if(boxes.charAt(j)=='1') {
	                		sum = sum+Math.abs(i-j);
	                //	}
	                }
	                
	                ans[i] = sum;
	            }
	        }
	        
	        System.out.println(Arrays.toString(ans));
	}

	
}
