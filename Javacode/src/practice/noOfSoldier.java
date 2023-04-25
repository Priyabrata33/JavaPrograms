package practice;
import java.util.*;

public class noOfSoldier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mat[][] = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
		
		 List<Integer> li = new ArrayList<>();
	        
	        for(int i=0;i<mat.length;i++){
	            int noSol = 0;
	            for(int j=0;j<mat[i].length;j++)
	               if(mat[i][j]==1)
	                   noSol++;
	            li.add(noSol);
	                   
	                
	        }
	        
	        ArrayList<Integer> li1 = new ArrayList<>();
            for(int i=0;i<li.size();i++)
            	li1.add(li.get(i));
            
            
          
            Collections.sort(li1);
            int k =3;
            
         int[] ans = new int[3];
            for(int i=0;i<k;i++) {
            	for(int j=0;j<li1.size();j++){
            		
            		if(li1.get(i)==li.get(j)){
            			ans[i] = j;
            			li.set(j,-1);
            			break;
            			
            		}
            		
            	}
            	
            }
            
           System.out.println(Arrays.toString(ans));
           System.out.println(li);
           System.out.println(li1);
	       
	        
	}

}
