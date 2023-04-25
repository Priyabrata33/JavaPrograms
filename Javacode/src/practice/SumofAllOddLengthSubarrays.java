package practice;

import java.util.Arrays;

public class SumofAllOddLengthSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,-4,3,-5,4};
		int sum =0;
        int[] preSum = new int[arr.length];
        int i=0;
        preSum[i]=arr[0];
        for(i=1;i<arr.length;i++){
            preSum[i]=preSum[i-1]+arr[i];
        }
        
        for(int j=0;j<arr.length;j++){
            sum  = sum + preSum[j];
        }
        System.out.println(Arrays.toString(preSum));
        
        System.out.println(sum);
        
        
        int maxEnd = arr[0];
        int res = arr[0];
        for(int k=1;k<arr.length;k++) {
        	maxEnd = Math.max(arr[k]+maxEnd, arr[k]);
        	res = Math.max(maxEnd, res);
        }
        
        
        
        System.out.println(res);
        
        System.out.println(3%4);
	}

}
