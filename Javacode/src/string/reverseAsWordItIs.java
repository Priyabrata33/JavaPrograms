package string;
import java.util.*;

public class reverseAsWordItIs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "the sky is blue";
		Stack<String> st = new Stack<>();
		String ans = "";
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '|| i==s.length()) {
				st.push(ans);
				ans ="";
			}
			else ans+=s.charAt(i);
		}
		st.push(ans);
		ans ="";
		
		System.out.println(st);
		
		for(int i=0;i<st.size();i++) {
			System.out.println(st.pop());
		}
		
		
	}

}
