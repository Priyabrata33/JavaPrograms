package searching;

public class sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2147395600;
		System.out.println(Sqrt(x));

	}
	
	public static int Sqrt(int x) {
		
		 int start =1,end  = x,ans = 0;
	        
	        while(start<=end){
	            int mid = start + (end - start) /2;
	            System.out.println(mid);
	            
	            if(mid*mid == x)
	                return mid;
	            else if(x>mid*mid){
	               ans = mid;
	                start  = mid+1;
	            }
	                
	            else if(x<mid*mid){
	                
	                end  = mid-1;
	            }
	                
	        }
	        
	        return ans;
	}

}
