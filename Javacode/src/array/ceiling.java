package array;

import java.util.Arrays;
import java.util.Scanner;

public class ceiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		int[] arr = {2,3,5,9,14,16,18};
		
		System.out.println(Arrays.toString(arr));
		
		int target = 15;
		int ans = ceiling(arr,target);
		
		System.out.println(ans);
		

	}

	private static int ceiling(int[] arr, int target){
		// TODO Auto-generated method stub
		int start = 0;
		int end = arr.length+1;
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
			
			if(target==arr[mid]) {
				return mid;
			}else if(target>arr[mid]) {
				start = mid +1;
			}else if (target<arr[mid]) {
				end = mid -1;
			}
		}
		return start;
	}

}
