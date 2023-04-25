package string;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String s= "racecar";
		int left = 0;
        int right = s.length()-1;
        boolean ans = true;
        
        while(left<=right){
            
            if(s.charAt(left)!=s.charAt(right)){  ans =  false;  }
        
            left++;
            right--;
        }
        
        
        System.out.println(ans);

	}

}
