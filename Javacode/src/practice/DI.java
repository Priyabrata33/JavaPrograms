package practice;

public class DI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="DII";
		System.out.println(s.length());
		int size = s.length();
		 int low =0;
	        int high = size+1;
	        
	        int[] ans = new int[size+1];
	            
	            for(int i=0;i<ans.length;i++){
	            	
	                if(s.charAt(i)=='D')
	                    ans[i] = high--;
	                else if(s.charAt(i)=='I')
	                    ans[i] = low++;
	            }
	            
	            
	            System.out.println(size);
	        
		
	}

}
