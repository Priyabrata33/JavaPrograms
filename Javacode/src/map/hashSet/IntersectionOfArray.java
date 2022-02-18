package map.hashSet;
import java.util.*;

public class IntersectionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> s = new HashSet<>();
		int[] nums1 = {10,15,20,15,30,30,5};
		int[] nums2 = {30,5,30,80};
		
//		
//		for(int i=0;i<nums1.length;i++) {
//			for(int j=0;j<nums2.length;j++) {				//O(n*m)
//				x
//				if(nums1[i]==nums2[j])
//					s.add(nums1[i]);
//			}
//		}
//		
		int res =0;
		for(int i=0;i<nums1.length;i++) {
			s.add(nums1[i]);
		}
		
		for(int j=0;j<nums2.length;j++) {
			if(s.contains(nums2[j])) {
				res++;
				s.remove(nums2[j]);						//remove because if extra thing are present the it going to deficault O(N+M)
			}
		}
		
		System.out.println(res);
		
		
	}

}
