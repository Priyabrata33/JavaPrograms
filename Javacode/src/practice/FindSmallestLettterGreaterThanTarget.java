package practice;

public class FindSmallestLettterGreaterThanTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] letters = {'c','f','j'};
		char target = 'c';
		
		 int start = 0;
	        int end = letters.length-1;
	        
	        
	        if (target > letters[end]) {
	        	System.out.println(letters[start]); 
	        }
	        
	        while(start<=end){
	        	
	            int mid = start + (end - start) /2;
	            
	            if(target < letters[mid]){
	            	
	                end = mid-1;
	                
	            }else if(target > letters[mid]){
	            	
	                start = mid + 1;
	            }
	        }
	        
	        System.out.println(letters[start % letters.length]); 
	        

	}

}
