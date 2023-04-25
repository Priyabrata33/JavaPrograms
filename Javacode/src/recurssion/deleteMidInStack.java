package recurssion;

import java.util.*;

public class deleteMidInStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer>  st = new Stack<>();
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		System.out.println(st);
		
		delete(st,(st.size()/2)+1);
		System.out.println(st);

	}

	private static void delete(Stack<Integer> st, int size) {
	
		if(st.size()==0)
			return;
		
		if(st.size()==size) {
			st.pop();
			return;
		}
		
		int x = st.pop();
		
		delete(st,size--);
		
		st.push(x);
		
	}

	
}
