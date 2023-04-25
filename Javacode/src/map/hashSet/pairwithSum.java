package map.hashSet;
import java.util.*;

public class pairwithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {3,2,8,15,-8};
		int sum =17;
		int ans =0;
		
		boolean an = false;
		Set<Integer> s= new HashSet<>();
		
		for(int i =0;i<nums.length;i++) {
			
			if(s.contains(sum-nums[i])) {
				System.out.println(true);
				break;
			}
			
			s.add(nums[i]);
           
        }
        
		

	}

}
