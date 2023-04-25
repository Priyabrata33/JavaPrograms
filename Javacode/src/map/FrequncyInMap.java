package map;
import java.util.*;

public class FrequncyInMap {

	public static void main(String[] args) {
		
		int[] arr = {8, 7, 7, 7, 9, 9,12};
		
		//int[] ans =new int[5];
		
		Map<Integer,Integer> m1 = new HashMap<>();
		
		for(int i=0;i<arr.length;i++){
			
			m1.put(arr[i],i);     			//here we put the array value in the Map	
			
		}
		
		System.out.println(m1.get(9));				//here we print the value of the the given key here...
		
		
		
		
		System.out.println(m1.containsKey(arr[0]));	//check the value present here or not.......
		
		
		
		for(int i=0;i<arr.length;i++) {
			
			m1.get(arr[i]+1);
			

		}
		
	}

}
