package practice2;

import java.util.Arrays;

class Stack{
	
	int top1,top2,cap;
	
	int[] arr;
	
	Stack(int n){
		top1 = -1;
		top2 = n;
		cap = n;
		arr = new int[cap];
	}
	
	void push1(int x) {
		if(top1<top2-1) {
			top1++;
			arr[top1] = x;
		}
		else {
			System.out.println("over flow");
		}
	}
		
	void push2(int x) {
			if(top1<top2-1) {
				top2--;
				arr[top2] = x;
			}
			else {
				System.out.println("over flow");
			}
			
		}
	
	int pop1() {
		int ans= 0;
		if(top1>=0) {
			ans= arr[top1];
			arr[top1] = 0;
			top1--;
			return ans;
		}
		else {
				System.out.println("under flow");
			
			return -1;
		}
	}
	int pop2() {
		int ans= 0;
		if(top2<=cap-1) {
			ans= arr[top2];
			arr[top2] = 0;
			top2++;
			return ans;
		}
		else {
			System.out.println("under flow");
			return -1;
		}	
	}
}
	
	
public class twoStackInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s = new Stack(10);
		
		s.push1(10);
		s.push2(100);
		s.push1(20);
		s.push2(90);
		s.push1(30);
		s.push2(80);
		
		System.out.println(Arrays.toString(s.arr));
		System.out.println(s.pop2());
		System.out.println(Arrays.toString(s.arr));
		
		
	}

}
