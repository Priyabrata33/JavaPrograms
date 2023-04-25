 package map.hashSet;

import java.util.*;

public class UnionOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stubx
		
		
		int nums1[] = {15,20,5,10};
		int nums2[] = {15,15,15,20,10};
		
		HashSet<Integer> s = new HashSet<>();
		
		for(int i:nums1) {
			s.add(i);
		}
		
		for(int i:nums2) {
			s.add(i);
		}
		
		System.out.println(s.size());
		
		System.out.println(s);
		
	}

}
