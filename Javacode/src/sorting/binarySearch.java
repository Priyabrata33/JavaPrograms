package sorting;

public class binarySearch {

	public static void main(String[] args) {
		
		int[] arr = {-10,-9,-8,-4,12,28,90,100,109,120};
		
		int target = 28;
		
		System.out.println(binarySearch(arr,target)); //the complexity of binary search is logN
	}

	private static int binarySearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		int start =0;
		int end = arr.length-1;
		
		
		
		while(start <=end ){
			int mid = start +(end-start) /2;
			
			if (arr[mid]>target) {
				end = mid - 1;
			}else if (arr[mid]<target) {
				start = mid + 1;
			}else {
				return mid;
			}
		}
	return -1;
	}

}
