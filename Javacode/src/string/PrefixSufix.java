package string;

import java.util.ArrayList;

public class PrefixSufix {

	public static void main(String[] args) {
		String str = "abacabad";
		ArrayList<Integer> ar = new ArrayList<>();
		
		for(int i = 0 ; i<str.length();i++) {
			ar.add(proPreSufix(str,i));
		}
		System.out.println(ar);

	}

	private static Integer proPreSufix(String str, int n) {
		for(int len = n-1;len>0;len--) {
			boolean flag = true;
			for(int i=0;i<len;i++) {
				if(str.charAt(i)!=str.charAt(n-len+i))
					flag = false;
			}
			if(flag==true)
				return len;
		}
		
		return 0;
	}

}
