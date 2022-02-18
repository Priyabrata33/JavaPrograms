package practice;
import java.util.*;

public class DecompressRun_LengthEncodedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		  ArrayList<Integer> li = new ArrayList<>();
	       
		int i=0;
		int f=0;
		int v=1;
				while(i<(nums.length/2)) {
			int frequency = nums[f];
			int val = nums[v];
			for(int l=1;l<=frequency;l++) {
				li.add(val);
			}
			f+=2;
			v+=2;
			i++;
			
			
		}
		
		System.out.println(li);
		int[] ans  = new int[li.size()];
		for(int j=0;j<li.size();j++) {
			ans[j] = li.get(j);
		}
		
		System.out.println(Arrays.toString(ans));
	}
	
	

}
