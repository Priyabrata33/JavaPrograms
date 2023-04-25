package practice;

import java.util.*;

public class Exa {
	
	public static String stringChallenge(String str) {
		Stack<Character> st = new Stack<>();
		Deque<Integer> d = new LinkedList<>();
		
		for(int i=0;i<str.length();i++) {
			 {
				st.push(str.charAt(i));
			}
		}
		
		System.out.println(st);
		
		return str;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num   ="4+5+(4*5)";
		System.out.println(stringChallenge(num));
		
		
	}
	
	
	

}
