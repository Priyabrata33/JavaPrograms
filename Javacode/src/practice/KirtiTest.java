package practice;
import java.util.*;

public class KirtiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {1,2,3,4,5,7,8,9};
		
		
		

		PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<nums.length;i++){
            p.add(nums[i]);
        }
        
        System.out.println(p);
		
		System.out.println(p.poll());
		
        System.out.println(p);

	}

}
