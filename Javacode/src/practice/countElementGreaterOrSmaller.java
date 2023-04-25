package practice;
import java.util.*;

public class countElementGreaterOrSmaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] nums  = {3,1,-2,-5,2,-4};
		 List<Integer> nege = new ArrayList<>();
	        List<Integer> posi = new ArrayList<>();
	        
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]<0)
	                nege.add(nums[i]);
	            else if(nums[i]>0)
	                posi.add(nums[i]);
	        }
	        
	        
	        System.out.println(posi);
	        System.out.println(nege);
	        int j = 0;
	        
	        for(int i =0;i<nums.length-1;i=i+2){
	            nums[i] = posi.get(j);
	            nums[i+1] = nege.get(j);
	            j++;
	        }
	        
	        System.out.println(Arrays.toString(nums));
	}

}
