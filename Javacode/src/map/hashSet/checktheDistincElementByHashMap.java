package map.hashSet;
import java.util.*;

public class checktheDistincElementByHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {15,12,13,12,13,13,18};
		Set<Integer> S = new HashSet<>();
		
		for(int i=0;i<nums.length;i++) {
			S.add(nums[i]);
		}
		
		System.out.println(S.size()); 
		System.out.println(S);
		
		Map<Character[],Integer> m = new HashMap<>();

	}

}
