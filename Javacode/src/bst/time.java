package bst;
public class time{
 		    public static void main(String args[]){
	        
	    	int[] arr = {10,10,20,30,40,40,50,50,90};
	    	int k = 7;
	    	
	    	int min = arr[0];
	    	int max = arr[0];
	    	for(int i=0;i<arr.length;i++) {
	    		if(min>arr[i]) min =  arr[i];
	    		if(max<arr[i]) max = arr[i];
	    	}
	    
	    	
	    	while(min<=max) {
	    		int mid= min+(max-min)/2;
	    		
	    		int cnt1 =countOf(arr,mid);
	    	
	    	
	    		if(cnt1<k) {
	    			min = mid+1;
	    		}
	    		
	    		else {
	    			int cnt2 = countOf(arr,mid-1);
	    		
	    			if(cnt2<k) {
	    				System.out.println(mid);
	    				break;
	    			}
	    			else max = mid-1;
	    		}
	    	}
	    	
	    }
 		    
 		    public static int countOf(int[] nums,int mid) {
 		    	int cnt =0;
 		    	for(int i=0;i<nums.length;i++) {
 		    		if(nums[i]<=mid) ++cnt;
 		    		
 		    	}
 		    	return cnt;
 		    }
}


	


