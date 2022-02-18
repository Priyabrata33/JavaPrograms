package practice;
import java.util.*;

public class IntervalsBetweenIdenticalElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[]	arr = {2,1,3,1,2,3,3};
	//int target =3;
	int n =arr.length;
    int[] ans = new int[n];
    
    
     List<Integer> big = new ArrayList<>();
    
    for(int i=0;i<arr.length;i++){
    	
    	List<Integer> list = new ArrayList<>();
    	
    	for(int j=0;j<arr.length;j++) {
    		int ans1=0;
    		if(arr[i]==arr[j]) {
    			list.add(j);
    			System.out.println("j"+j);
    			ans1=(j-i);
    			if (ans1<0) {
    				
    			}
    			big.add(ans1);
    		}
    		System.out.println("i"+i);
    		
    	}
    	
    	System.out.println(list);
    	
    		
    	
    	
    
    }
    	
    	
    
    
    System.out.println(big);
    
	}
		

	
}
	
        
