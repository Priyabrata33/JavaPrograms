package practice;

public class SliddingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {1,2};
		int k =1;
		int low =0;
		int high = k-1;
		int ans =0;
		
		while(low<=high && high<arr.length) {
			int sum =0;
			int i=low;
			while(i<=high ) {
				sum = sum+arr[i];
				i++;
				
			}
			//System.out.println(sum);
			low++;
			high++;
			System.out.print(" "+sum);
			ans = Math.max(ans,sum);
		}
		System.out.println("\n"+ans);
	}

}
