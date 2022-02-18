package array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {5,3,6,1,12};
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter the number in array you want to Search : ");
		int target = sc.nextInt();
		
		System.out.println("the given index is "+binarySearch(arr,target));
		
	}

	private static int binarySearch(int[] arr,int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			//find the middle element ------
			int mid = start + (end - start)/2;
			if(target==arr[mid]) {
				return mid;
			}else if(target>arr[mid]) {
				start = mid +1;
			}else if (target<arr[mid]) {
				end = mid -1;
			}
		}
		return -1;
	}
}
	
