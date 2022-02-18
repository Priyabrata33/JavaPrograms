 package practice;

public class sumofalloddlengthArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2};
		int ans =0;
		
		int n=1;
		  
        while(n<=arr.length){
          
        	int curSum =0;
        	
            for(int i=0;i<n;i++)
             curSum += arr[i]; 
            
            
            ans +=curSum; 
            System.out.println(curSum);
            
            
            for(int i=n;i<arr.length;i++) {
            	
            	curSum+=arr[i]-arr[i-n];
            	
            	
            	//curSum+=arr[i];
            	ans +=curSum; 
            }
            
           
            
            n=n+2;
            
            
            
        }
        
        System.out.println(ans);
        
       

	}
	
	
	        
	   

}
