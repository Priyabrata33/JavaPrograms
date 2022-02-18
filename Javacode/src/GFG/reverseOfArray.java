package GFG;

import java.util.Arrays;

public class reverseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,5,7,30};
		int[] rev = new int[arr.length];
		
		int j =0;
//		for(int i = arr.length-1;i>=0;i--) {
//			rev[j]= arr[i];
//			j++;
//		}
			//System.out.println(Arrays.toString(rev));				//the reverse order of the array can find this also
			
			
			System.out.println(Arrays.toString(arr));
			int low = 0;
			int high = arr.length-1;
			while(low<high) {
				int temp= arr[low];
				 arr[low] =arr[high];
				 arr[high] = temp;
				 low++;
				 high--;
			}
			System.out.println(Arrays.toString(arr));
		}
	
	
	

}
