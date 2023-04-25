package stack.stackArrayList;
import java.util.*;
class MyStack{
	
	int top =-1;
	
	ArrayList<Integer> ar;
	MyStack(){
		 ar  = new ArrayList<>();
	}
	
	void push(int x) {
		ar.add(x);
		top++;
	}
	
	int pop() {
		
		if(top==-1) {
			System.out.println("No Item");
			return -1;
		}
		
		return ar.remove(ar.size()-1);
		
	}
	
	int peak()
	{
		return ar.get(ar.size()-1);
	}
	int size(){
	
		return ar.size();
	}
	boolean isEmpty() {
		return ar.isEmpty();
	}
}

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStack s = new MyStack();
		s.push(10);
		s.push(20);
		System.out.println(s.pop());
		System.out.println(s.size());
		System.out.println(s.isEmpty());
	}

}
