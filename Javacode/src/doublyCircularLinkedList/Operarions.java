package doublyCircularLinkedList;

class Node{
	int data;
	Node prev;
	Node next;
	Node(int data){
		this.data = data;
	}
}

public class Operarions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = null;
		head = insertion(head,10);
		traverse(head);
		System.out.println();
		head = insertion(head,20);
		traverse(head);
		System.out.println();
		head= insertion(head,30);
		traverse(head);
		
		System.out.println();
		head = insertionAtEnd(head,5);
		traverse(head);
	}
	public static Node insertion(Node head,int data) {
		Node inNode = new Node(data);
		
		if(head==null) {
			inNode.next = inNode;
			inNode.prev =inNode;
		}
		
		else {
			inNode.next = head;
			inNode.prev  = head.prev;
			
			head.prev.next = inNode;
			head.prev = inNode;
			
			
		}
		
		return inNode;
	}
public static Node traverse(Node head){
		
		
		if(head==null) return null;
		//if(head.next == head) System.out.println(head.data);
		//Node tail  = null;
		Node cur = head;
		
		Node tail =head;
		
		do {
			System.out.print(cur.data+ "->");
			cur= cur.next;
			
			if(cur.next ==head)
				tail = cur;
			if(cur==head) {
				break;
				}
			
		}while(cur!=head);
		
		
		
		
			//Using For Loop
		
		
		//System.out.println();
//			System.out.println("Using For loop to see");
//			if(head==null) return null;
//			
//			System.out.print(head.data+"->");
//			
//			for(Node r = head.next;r!=head;r =r.next)
//				System.out.print(r.data+"->");
			
			
		
		return tail;
		
	}
public static Node insertionAtEnd(Node head,int data) {
	Node inNode = new Node(data);
	
	if(head==null) {
		inNode.next = inNode;
		inNode.prev =inNode;
	}
	
	else {
		inNode.next = head;
		inNode.prev  = head.prev;
		
		head.prev.next = inNode;
		head.prev = inNode;
		
		
	}
	
	return head;
}

}
