package GFG;

import java.util.Arrays;

public class deleteofArray {
	public static void main(String[] args) {
		int[] arr = {12,90,14,17,87};
		int n= arr.length;
		int x = 0;
		int pos=0;
		boolean isboolean = false;
		for(int i=0;i<n;i++) {
			if(arr[i] == x) {
				pos = i;
				isboolean = true;
				break;
				
			}else if(i==n-1) {
					System.out.println("there is no element ");
					break;
				}
			}
		if(isboolean) {
		for(int i=pos;i<n-1;i++) {
			  arr[i]=arr[i+1];
		}
		}
		
		
		
		//System.out.println(pos);
		System.out.println(Arrays.toString(arr));
		System.out.println(getlargest(arr));
		System.out.println(largest(arr));
		System.out.println("second largest "+ secondLargest(arr));
		
	}

	
	
	
	//NAIVE APPROACH
	private static int getlargest(int[] arr) {
		// TODO Auto-generated method stub
		int n= arr.length;
		//int max = 0;
		for(int i=0;i<n;i++) {
			boolean flag = true;
			for(int j=0;j<n;j++) {   				
				if(arr[j]>arr[i]) {
					flag = false;
					//max = i;
					break;
				}
			}
			
			if(flag==true)
				return i;
		}
		
		
		return -1;
	}
	
	//efficient Approach of NAVVIE APPROACH
	
	private static int largest(int[] arr) {
		int max =0;
		int n = arr.length;
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[max]) {
				max = i;
			}//else max = i;
		}
		return max;

	}
	public static int secondLargest(int[] arr) {
		
		int res =0;
		int largest = largest(arr);
		
		System.out.println(largest);
		for(int i =0;i<arr.length;i++) {
			
			if(arr[i]!= arr[largest]) 
			{
				if(res==-1)
					return i;
				else if(arr[i]> arr[res])
					res = i;
			}
		}
		
		return res;
		
	
	}
	
}
