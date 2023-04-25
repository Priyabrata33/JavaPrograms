package GFG;

public class Sortedornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[]  arr = {8, 7, 13};
			boolean ans = checkSorted(arr);
			System.out.println(ans);
			
	}
	
	public static boolean checkSorted(int[] arr) {
		boolean ans = false;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				ans = false;
				break;
			}
			else ans = true;
		}
		
		return ans;
	}

}
