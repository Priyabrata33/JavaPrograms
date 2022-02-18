package practice;

public class ceilingFlooring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2, 3, 5, 9, 14, 16, 20, 36, 48};
		int target = 15 ;
		
		
		int ans = Ceiling(arr,target);
		
		
		
		System.out.println("ceiling of the array " +ans);
		
		
		int floor = flooring(arr,target);
		System.out.println("floor of the number " +floor);
		

	}//time complexity of both the thing is O(1) at the best case and the O(logn) in the worst case

	private static int flooring(int[] arr, int target) { 
		//the greatest number between the smaller number of the given array 
		
		
		//if the target element is the smallest number of the smaller number in the given array then there is no flooring happen here
		
		
		
		int start =0;
		int end = arr.length-1;
		
		if (target<arr[start]) return -1;
		
		
		while(start<=end) {
			int mid = start + (end -start)/2;
			
			if(target > arr[mid]) {
				start = mid + 1;
			}else if(target<arr[mid]) {
				end = mid-1;
				
			}else if(target==mid) {
				
				return arr[mid];
			}
		}
		
		return arr[end];
	}

	private static int Ceiling(int[] arr, int target) {			
		// the smallest number between the greater number of the given array here	
		
		
		// what if the target element is greater then the greatest number of the given array then there is  no ceiling
		
		
		int start =0;
		int end = arr.length-1;
		
		if (target>arr[end]) return -1;
		while(start <= end) {
			int mid = start+(end-start)/2;
			
			if(target>arr[mid]) {
				start = mid+1;
			}else if(target<arr[mid]) {
				end =mid-1;
				
			}else if(target==mid) {
				return arr[mid];
			}
		}
		
		
		
		
		return arr[start];
	}

}
