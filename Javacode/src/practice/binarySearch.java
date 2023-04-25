package practice;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {2,4,6,9,11,12,14,20,36,48};
		
		int start =0;
		int end = arr.length-1;
		int target = 36;
		
		
		while(start<=end) {
			
			int mid = start+(end-start)/2;
			
			
			
			if(target>arr[mid]) {
				start = mid+1;
				
			}else if(target<arr[mid]) {
				end = mid-1;
				
			}else if(target==arr[mid]) {
				System.out.println(mid);
				break;
			}
			
			
		}
		
		
		
		
		
	}

}
