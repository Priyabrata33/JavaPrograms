package practice;

import java.util.Arrays;

public class LeetCodeIndexOfRepeatedNumber {

	public static void main (String[] argv) {
		
		int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
		
		int target = 7;
		
		int[] ans = {-1, -1};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				ans[0] = i;
				break;
			}
		}for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]==target) {
				ans[1] = i;
				break;
			}
		}
		
		System.out.println(Arrays.toString(ans));
		
	}

}
