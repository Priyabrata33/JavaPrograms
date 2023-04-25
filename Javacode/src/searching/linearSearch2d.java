package searching;

import java.util.Arrays;

public class linearSearch2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] mat = {
				
					{1,3,5,2,53},
					{56,98,01,9,4,2},
					{12,41,342,423},
					{999,79,865,87,90000}
		};
		int target = 98;
		int[] ans = search(mat,target);
		
		System.out.println(Arrays.toString(ans));
		System.out.println(max(mat));

		
		
	}
	
	
	public static int[] search(int[][] arr, int target ) {
		for(int row = 0;row<arr.length;row++) {
			for(int column = 0;column<arr[row].length;column++) {
					if(arr[row][column]==target) {
						return new int[] {row, column};
					}
			}
		}
		
		return new int[] {-1,-1};
	}
	public static int max(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for(int row = 0;row<arr.length;row++) {
			for(int column = 0;column<arr[row].length;column++) {
					if(arr[row][column]>max) {
						max = arr[row][column];
					}
			}
		}
		
		return max;
	}
}
