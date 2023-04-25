package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class FloorOfnumber {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int[] arr = {2,3,5,9,14,16,18};
		
		System.out.println(Arrays.toString(arr));
		
		int target = 15;
		int ans = floor(arr,target);
		
		System.out.println(ans);
		

	}//floor of a number id the number that the output number must be smaller and equal of the targeted given number....

	private static int floor(int[] arr, int target){
		// TODO Auto-generated method stub
		int start = 0;
		int end = arr.length;
		
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
		return arr[end];

	}

}
