package GFG;

import java.util.Arrays;
import java.util.Scanner;

public class recurssiveOfBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		int[] arr = {5,3,6,1,12};
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter the number in array you want to Search : ");
		int target = sc.nextInt();
		
		System.out.println("the given index is "+binarySearch(arr,0,arr.length-1,target));

	}
	
	public static int binarySearch(int[] nums,int start,int end, int target) {
		
			if(start>end) return -1;
		
			int mid = start+(end-start)/2;
			
			if(nums[mid]==target)
				return mid;
			else if(target<nums[mid])
				return binarySearch(nums,start,mid-1,target);
			else if(target>nums[mid])
				return binarySearch(nums,mid+1,end,target);
			
		
		
		return -1;
	}

}
