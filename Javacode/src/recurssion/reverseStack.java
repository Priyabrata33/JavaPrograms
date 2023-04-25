package recurssion;
import java.util.*;
public class reverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		System.out.println(st);
		reverse(st);
		System.out.println(st);
	}

	private static void reverse(Stack<Integer> st) {
		
		if(st.size()==0)
			return;
		
		int x = st.pop();
	
		
		reverse(st);
		
		insert(st,x);
		
		
			
	}

	private static void insert(Stack<Integer> st, int x) {
		// TODO Auto-generated method stub
		
		if(st.isEmpty()) {
			st.push(x);
			return;
		}
		
		int temp = st.pop();
		
		insert(st,x);
		
		st.push(temp);
		
		
	}

}
