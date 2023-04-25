package GFG;

public class SearchInInfinityArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	}
	
	public static int Search(int[] nums,int x) {
		if(nums[0]==x) return 0;
		int i =1;
		while(nums[i]<x) {
			i = i*2;
		}
		if(nums[i]==x) return i;
		else binarySearch(nums,i+1,i,x);
		
		return -1;
	}

	private static int binarySearch(int[] arr, int start, int end, int x) {
		// TODO Auto-generated method stub
		
		
		while(start <= end) {
			//find the middle element ------
			int mid = start + (end - start)/2;
			if(x==arr[mid]) {
				return mid;
			}else if(x>arr[mid]) {
				start = mid +1;
			}else if (x<arr[mid]) {
				end = mid -1;
			}
		}
		
		return -1;
	}

}
