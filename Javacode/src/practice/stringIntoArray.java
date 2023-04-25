package practice;

import java.util.Arrays;

public class stringIntoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s ="abcdefghi";
		int k= 3;
		char fill = 'x';
		int n ;
		if(s.length()%k==0) {
			n=s.length()/k;
		}else {
			n=s.length()/k+1;
		}
		char[] arr =new char[s.length()];
		for(int m=0;m<s.length();m++){
			arr[m]= s.charAt(m);
		}
        String[] ans = new String[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                
            }
        }
        System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(ans));
	}

}
