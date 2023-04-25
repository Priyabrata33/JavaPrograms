package ExceptionHandling;

import java.util.Arrays;

class StackOverFlow extends Exception{
	@Override
	public String toString() {
		return "Stack OverFlow Exception ";
	}
}




class StackUnderFlow extends Exception{
	@Override
	public String toString() {
		return "Stack UnderFlow Exception nothing to delete ";
	}
}




class Stack{
	private int size=5 ;
	
	
	
		int[] stack = new int[size];
	
	
	int top =-1;
	 
	
	void push(int a) throws StackOverFlow {
		top++;
		
		
		if(top>size-1)
			throw new StackOverFlow();
		
		for(int i=top;i<stack.length-1;i++){
			stack[i+1] = stack[i];
		}
		
		stack[top]=a;
	}
	void pop() throws StackUnderFlow {
		
		if(top==-1)
			throw new StackUnderFlow();
		
		System.out.println("delete the element" +stack[top]);
		
		stack[top] = 0;
		top--;	
	}
	
}

public class StackStudentChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s = new Stack();
		try {
			s.push(10);
			s.push(20);
			s.push(40);
			s.push(60);
			s.push(90);
			s.push(90);
			}
			catch(StackOverFlow e) {
				System.out.println(e);
			}
		System.out.println(Arrays.toString(s.stack));
		
		try {
			s.pop();
		}
		catch(StackUnderFlow e) {
			System.out.println(e);
		}
		
		
		
		finally {
			System.out.println(Arrays.toString(s.stack));
		}
		
	}

}
