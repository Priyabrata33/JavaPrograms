package practice;

import java.util.*;

	
	


public class frquency {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		String myString = "abaababbabcbabsbbababababb";
		process(myString);
}

	private static void process(String input) {
		Set store = new HashSet ();
				String result = "";
				for (int index = input.length() - 1; index >= 0; index--) {
				Character ch = input.charAt(index);
				if (!store.contains(ch)) {
					store.add(ch);
					result = result + ch;
				}
				
		
	}
				System.out.println (result);
	
	
}
	
}
	
	
	
			
	
	


