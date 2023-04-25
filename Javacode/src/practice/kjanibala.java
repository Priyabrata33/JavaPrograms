package practice;
import java.util.*;

public class kjanibala {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int count = 0;
		 int num =4;
	        
	        //int rem =0;
	        
	        for(int i=2;i<=num;i++){
	            
	         ArrayList<Integer> li  = new ArrayList<>(); 
	        int rem =i;
	        while(rem>0)
	        {
	            li.add(rem%10);
	            rem=i/10;
	        }
	    
	        int sum = 0;
	        
	        for(int j=0;j<li.size();j++)
	        {
	            sum +=li.get(j);
	        }
	        System.out.println(i);
	        
	        if(sum%2==0)
	            count++;
	        
	     
	        }
	       System.out.println(count); 

	}

}
