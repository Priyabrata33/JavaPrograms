package map.hashSet;
import java.util.*;

public class rodRing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int logs[][] = {{0,5},{1,2},{0,2},{0,5},{1,3}};
		int k=0;
		int [] ans =new int[k];
        HashMap<Integer,Integer> m = new HashMap<>();
        
        
        for(int[] i:logs){
        	if(m.containsKey(i[0])) {
        		if(m.getOrDefault(i[0], i[1])>i[1]) {
        			
        			System.out.println(i[1]);
        		}
        	}
        	
        	m.put(i[0], i[1]);
        	
        }
        
      
        
        
        System.out.println(m);
	        
	}

}
