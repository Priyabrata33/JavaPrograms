package queueArrayy.lnkedListQueue;



class Node {
	
	int data;
	Node next;
	
	Node(int x){
	data = x;
		next = null;
	}
	
	
}
class Queue{
	
	
	int size = 0;
	Node rear;
	Node front;
	Node head;
	
	Queue(){
		
		front = head;
		rear = head;
	}
	
	void enque(int x) {
	
		
		
		Node inNode = new Node(x);
		
		if(head==null) {
			head = inNode;
			front = head;
			rear  = head;
			
		}
		
		else {
		rear.next = inNode;
		rear = inNode;
		++size;
		}
		
	}
	int deQue() {
		int x = head.data;
		head = head.next;
		front = head;
		--size;
		
		return x;
	}
	
	int size() {
		return size+1;
	}
	
	int getFront() {
		return front.data;
	}
	int getRear() {
		return rear.data;
	}
	
	void show() {
		
			Node cur = head;
			
			while(cur!=null) {
				
			System.out.print(cur.data +"->");
			cur = cur.next;
			}
	}
	
boolean isEmpty() {
	if(size==0)
		return true;
	return false;
}
	
}
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q= new Queue();
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.enque(40);
		q.enque(50);
		
		
		q.show();
		System.out.println();
		
	
		System.out.println(q.getFront()+ " " +q.getRear() + " " +q.size());
		System.out.println(q.deQue());
		q.show();
		System.out.println();
		q.enque(10);
		q.show();
		System.out.println();
		System.out.println(q.getFront()+ " " +q.getRear() + " " +q.size() + " " +q.isEmpty() );
		
		
		
		
	}

}
