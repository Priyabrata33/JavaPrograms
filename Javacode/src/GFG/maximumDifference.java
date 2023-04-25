package GFG;

public class maximumDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {30,10,8,2};
		
		int ans = maximumDifference(arr);
		
		System.out.println(ans);
		

	}
	
//	public static int maximumDifference(int[] arr){
//		
//		int big = Integer.MIN_VALUE;
//		
//		
//			for(int j=arr.length-1;j>0;j--) {
//				
//				for(int i =0;i<arr.length;i++) {
//				if(j>i) {
//					int dif = arr[j] - arr[i];
//					
//					if(dif>big) {
//						big = dif;
//					}
//				}
//				
//				
//			}
//		}
//		
//		
//		return big;
//	}
	
	
	public static int maximumDifference(int[] arr) {
		
		int res = arr[1] - arr[0];
		int minVal = arr[0];
		
		for(int i =1;i<arr.length;i++) {
			
			res = Math.max(res, arr[i]-minVal);
			minVal = Math.min(minVal, arr[i]);
			
			}
			
		return res;
		}
		
		
		
	

}
