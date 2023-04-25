package circularLinkedList;


//circular linkedList have the same class like single Linked List
class Node{
	int data;
	Node next;
	Node(int x){
		data = x;
	}
}


public class traversalInLInkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Node head = new Node(10);
			Node n1  = new Node(20);
			Node n2 = new Node(30);
			
			head.next = n1;
			n1.next = n2;
			n2.next = head;
			
			System.out.println(n2.next);
			Node tail = traverse(head);
			System.out.println();
			System.out.println("Tail "+tail.data+" Address "+tail.next);
			
			
			System.out.println();System.out.println("here it is:");
			Node t = insertatFirst(head,5);
			traverse(t);
			
			
			
			System.out.println();
			System.out.println();
			System.out.println("insert at the end: ");
			head = insertAtEnd(head,40);
			traverse(head);
			
			
			t =deleteAtFirst(head);
			traverse(t);
			
			
			System.out.println();
			t = deletekthNode(head,1);
			traverse(t);
			
		
		

	}
	
	

	public static Node traverse(Node head){
		
		
		if(head==null) return null;
		if(head.next == head) System.out.println(head.data);
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
		
		
		System.out.println();
//			System.out.println("Using For loop to see");
//			if(head==null) return null;
//			
//			System.out.print(head.data+"->");
//			
//			for(Node r = head.next;r!=head;r =r.next)
//				System.out.print(r.data+"->");
			
			
		
		return tail;
		
	}
	
	public static Node insertatFirst(Node head,int data) {
		Node inNode = new Node(data);
		if(head == null) { 
			inNode.next = inNode; 
			//return inNode;
		}
//		else {
//		Node r = head;
//		
//		
//		do {
//			
//			if(r.next==head) {
//				r.next = inNode;
//				inNode.next = head;
//			}
//			r  = r.next;
//			
//		}while(r!=head);
//	
//		return inNode;
//		}
		else {
		
		inNode.next = head.next;
		head.next = inNode;
		System.out.println("time:");
		
//		traverse(head);
		int t = head.data;
		head.data = inNode.data;
		inNode.data = t;
		
		return head;
		
		}
		
		return head;
	}
	
	public static Node insertAtEnd(Node head, int data) {
		Node inNode = new Node(data);
		
		if(head==null) { 
			inNode.next = inNode;
			return inNode;
		}
//		else {
//			Node r = head;
//			while(r.next!=head)
//				r=r.next;
//			r.next = inNode;
//			inNode.next = head;
//		}
		
		inNode.next = head.next;
		head.next = inNode;
		System.out.println("time:");
		
//		traverse(head);
		int t = head.data;
		head.data = inNode.data;
		inNode.data = t;
		//traverse(inNode);
		
		return inNode;
		
		
		
	}
	
	public static Node deleteAtFirst(Node head) {
		
		if(head==null||head.next==null) return null;
		
		Node t = head;
		
//		while(t.next!=head)
//			t = t.next;
//		
//	head = head.next;
//	t.next = head;
		
		head.data = head.next.data;
		head.next = head.next.next;
		
	return head;
		
	}
	public static Node deletekthNode(Node head,int pos) {
		int count = 1;
		
		Node r = head;
		
		if(pos==1) {
			
//			while(r.next != head)
//					r = r.next;
			
//			r.next = head.next;
//			head = head.next;
			r.data = r.next.data;
			r.next = r.next.next;
		

		}
		
		else {
		while(r.next!=head && count<pos-1) {
			r = r.next;
			count++;
		}
		r.next = r.next.next;
		}
		return head;
	}
	
	

}
