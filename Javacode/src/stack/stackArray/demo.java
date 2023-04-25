package stack.stackArray;

import java.util.Arrays;

class MyStack{
	int arr[];
	int cap;
	int top;
	int min;
	
	MyStack(int c){
		top = -1;
		cap = c;
		arr = new int[cap];
	}
	
	
	void push(int x) {
		top++;
		arr[top] = x;
		
		if(min>x) min = x;
	}
	int pop() {
		
		if(top==-1) {
			System.out.println("underFlow");
			return -1;
		}
		
		
		
		
		int res = arr[top];
		if(res==min) {
			
		}
		
		top--;
		return res;
	}
	int size() {
		return top+1;
	}
	
	boolean isEmpty() {
		if(top==-1)
			return true;
		return false;
	} 
	
	
	
}



public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyStack s = new MyStack(5);
		
		s.push(10);
		s.push(20);
		System.out.println(s.size());
		
		s.push(5);
		s.push(30);
		
		
		
	}

}
