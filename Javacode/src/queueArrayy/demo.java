 
package queueArrayy;

import java.util.Arrays;

class Queue{
	
	int[] arr;
	int cap;
	int front,rear;
	int size = 0;
	Queue(int n){
		cap = n;
		arr = new int[cap];
		front = 0;
		rear = -1;
		
	}
	
	void enQueue(int x) {
		arr[(rear+1)%cap] = x;
		rear++;
		size++;
	}
	int deQueue() {
		int x = arr[front%cap];
		arr[front] =0;
		front = (front+1)%cap;
		size--;
		return x;
	}
	
	int size() {
		return size;
	}
	int getFront()
	{
		return arr[front];
	}
	int getRear() {
		return arr[rear-1];
	}
	
	boolean isFull() {
		if(size>=cap )
			return true;
		
		return false;
	}
	boolean isEmpty() {
		if(rear<front) {
			return true;
		}
		return false;
	}
	
	void show() {
		System.out.println(Arrays.toString(arr));
	}
}
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(5);
		q.enQueue(10);
		q.enQueue(15);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.show();
		
		System.out.println(q.getFront()+ " " +q.getRear()+ " " +q.size()+ " "+q.isEmpty() +" " +q.isFull());
		
		q.deQueue();
		q.deQueue();
		
		q.show();
		System.out.println(q.getFront()+ " " +q.getRear()+ " " +q.size()+ " "+q.isEmpty() +" " +q.isFull());
		
		q.enQueue(10);
		q.show();	
		System.out.println(q.getFront()+ " " +q.getRear()+ " " +q.size()+ " "+q.isEmpty() +" " +q.isFull());
		q.enQueue(30);
		
	}

}
