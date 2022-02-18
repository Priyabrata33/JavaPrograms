package practice;
import java.util.*;

public class spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		
			
		};
		
List<Integer> list = new ArrayList<>();
        
        int left = 0,right = matrix[0].length-1;
        int top = 0 , bottom = matrix.length-1;
        
        while(left<=right&& top<=bottom){
            
                for(int i=left;i<=right;i++){
                    list.add(matrix[left][i]);
                    
                } 
                
                top ++;
                
                System.out.println("left "+left);
                System.out.println("right "+right);
                System.out.println("top "+top);
                System.out.println("bottom " +bottom);
                
                
                System.out.println(list);
               
                for(int i=top;i<=bottom;i++) {
                	list.add(matrix[i][right]);
                	 
                }
                right--;
                System.out.println("left "+left);
                System.out.println("right "+right);
                System.out.println("top "+top);
                System.out.println("bottom " +bottom);
                
                
                System.out.println(list);
                
                for(int i=right;i>=left&&top<=bottom;i--) {
                	list.add(matrix[bottom][i]);
                }
                bottom--;
                
                System.out.println("left "+left);
                System.out.println("right "+right);
                System.out.println("top "+top);
                System.out.println("bottom " +bottom);
                
                
                System.out.println(list);
                
                for(int i=bottom;i>=top && left<=right;i--) {
                	list.add(matrix[i][left]);
                }
                System.out.println("left "+left);
                System.out.println("right "+right);
                System.out.println("top "+top);
                System.out.println("bottom " +bottom);
                
                
                System.out.println(list);
                
                left++;
               
            
            
            
            
        }
        
        System.out.println(list);

	}

}
