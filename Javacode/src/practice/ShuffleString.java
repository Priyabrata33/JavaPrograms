package practice;

import java.util.Arrays;

public class ShuffleString {

	public static void main(String[] args) {

        
		String s = "codeleet";
		//String ans = "";
		
		int[] indices = {4,5,6,7,0,2,1,3};
		
		
		char[] ch1 = new char[indices.length];
		
		System.out.println(Arrays.toString(ch1));
		
		int j=0;
		
		for(int i=0;i<ch1.length;i++) {
			//char temp = ;
			ch1[indices[i]] =s.charAt(j);
			j++;
			
		}
		String ans = new String(ch1);
		System.out.println(Arrays.toString(ch1));
		System.out.println(ans);
		
	}

}
