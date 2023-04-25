package recurssion;

import java.util.Stack;

public class sortStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer>  st = new Stack<>();
		
		st.push(10);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		System.out.println(st);
		sort(st);
		System.out.println(st);

	}
	
	public static void sort(Stack<Integer> st) {
		if(st.size()<=1)
			return ;
		
		int x = st.peek();
		st.pop();
		
		sort(st);
		insert(st,x);
	}

	private static void insert(Stack<Integer> st, int x) {
		// TODO Auto-generated method stub
		
		if(st.size()==0 || st.peek()<=x) {
			st.push(x);
			return;
		}
		int val = st.pop();
		
		insert(st,x);
		st.push(val);
		
		
	}
 
}
