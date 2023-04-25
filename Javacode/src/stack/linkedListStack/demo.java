package stack.linkedListStack;

import java.util.Stack;

class Node{
	
	int data;
	Node next;
	
	Node(int x){
		data = x;
	}
	
}

class stack{
	
	int top;
	Node head;
	
	stack(){
		
		head = null;
		top = 0;
		
	}
	void push(int x) {
		Node inNode = new Node(x);
		
		inNode.next = head;
		
		head = inNode;
		top++;
		
	}
	
	
	int pop() {
		if(top==0) { System.out.println("UnderFlow"); return -1;}
		int ans = head.data;
		
		head = head.next;
		top--;
		return ans;
	}
	

	int size() {
		return top;
	}
	boolean isEmpty() {
		
		if(top==0)
			return true;
		
		return false;
	}
	
	
	public static void show(stack s){
		
		Node cur = s.head;
		
		while(cur!=null) {
			
		System.out.print(cur.data +"->");
		cur = cur.next;
		
		
		}
	}
	
	
	
}

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stack s = new stack();
		s.push(5);
		s.push(10);
		s.push(20);
		
		s.show(s);
		System.out.println();
		System.out.println(s.pop());
		
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		s.show(s);
		
		Stack<Integer> st = new Stack<>();
		
		st.peek();
		

	}

}
