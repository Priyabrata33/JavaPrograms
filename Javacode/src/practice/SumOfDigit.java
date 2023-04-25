package practice;
import java.util.*;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int nums[] = {3,1,4,1,5};
		int k=2;
		//\\
		int count=0;
		Arrays.sort(nums);
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        arr.add(nums[0]);
       // int i=1;
        
        
        for(int i=1;i<nums.length;i++){
        	
            if(nums[i-1]!=nums[i])
            	
                arr.add(nums[i]);
        }
        
		
//        for(int i=0;i<arr.size()-1;i++){
//            for(int j=i+1;j<arr.size();j++){
//                if(Math.abs(arr.get(i)-arr.get(j))==k)
//                    count++;
//            }
//        }
        
        System.out.println(arr);
        int left =0;
        int right = arr.size()-1;
        System.out.println(left+ " "+right);
        while(left<=right){
            if(Math.abs(arr.get(left)-arr.get(right))==k) {
            	System.out.println(left+ " "+right);
            	
                count++;
                break;
            }
            else if(Math.abs(arr.get(left)-arr.get(right))>k)
                right--;
            else
                left++;
        }
        
		
		
		
		System.out.println(count);
	}

}
