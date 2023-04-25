package queueArrayy.lnkedListQueue;

class Deque {
	
	int cap,front,rear;
	int [] arr;
	
	Deque(int x){
		arr = new int[x];
		front =-1;
		rear = -1;
		cap = x;
	}
	
	void insertAtFront(int data) {
		if(rear==-1 && front == -1) {
			rear = cap/2;
			front = cap/2;
			arr[cap/2] = data;
		}
		else {
			front--;
			if(front==-1) {
				System.out.println("No front");
			}
			arr[front] = data;
		}
	}
	
}

public class stckQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
