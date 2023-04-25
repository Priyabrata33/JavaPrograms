package practice;

import java.util.ArrayList;

public class SubSequenceSum {

	public  void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[]  arr= {1,2,2,3,3,4,4,4,4,4,5,6};
			int count = 0;
			int low = 0, high = arr.length-1;
			int target =4;
			
			while(low<=high) {
				int mid = high + (low-high)/2;
				
				if(arr[mid]<target)
					low = mid+1;
				
				else if(arr[mid]>target)
					high = mid-1;
				
				else {
					count++;
					if(mid>0 || arr[mid-1]==target)
						high = mid-1;
					if(mid<arr.length-1 || arr[mid+1] == target)
						low = mid+1;
		
					}
				System.out.println(count);
				
			}
//			
//			System.out.println(count);
			
		
	}
}

 