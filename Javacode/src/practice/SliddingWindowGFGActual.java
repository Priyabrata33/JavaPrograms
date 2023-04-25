package practice;

public class SliddingWindowGFGActual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		int[] arr = {1,8,30,-5,20,7};
		int k =3;
		int given_sum = 45;
		int givsum =30;
		
		int cur_sum =0;
		for(int i=0;i<k;i++) 
			cur_sum +=arr[i];
		
		int max_sum = cur_sum;
		
		for(int i = k;i<arr.length;i++){
			cur_sum += arr[i]-arr[i-k];
			max_sum = Math.max(cur_sum, max_sum);
			
			if(cur_sum==given_sum) 
				System.out.println("from "+(i-1)+  "to" + (i+k-2) );
			
			if(givsum ==cur_sum) System.out.println("true");
				
			
		}
		
		
		
	}

}
