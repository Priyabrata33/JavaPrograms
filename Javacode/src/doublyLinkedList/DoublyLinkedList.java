package doublyLinkedList;


class Node{
	int data;
	Node prev;
	Node next;
	
	Node(int x){
		data = x;
		next = null;
		prev = null;
	}
}

public class DoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Node head = new Node(10);
		Node n1 = new Node(20);
		Node n2 = new Node(30);
		
		head.next = n1;
		n1.prev = head;
		n1.next = n2;
		n2.prev = n1;
		
		show(head);
		
		head = insertAtBegin(head,5);
		System.out.println();
		show(head);
		
		head = insertAtEnd(head,40);
		System.out.println();
		show(head);
		
		
		System.out.println();
		head = reverse(head);
		show(head);
		
		
		System.out.println();
		head = deleteAtfront(head);
		show(head);
		
		System.out.println();
		head = deleteAtEnd(head);
		show(head);
		
	}
	
	
	public static void show(Node head) {
		Node  temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"<=>");
			temp= temp.next;
		}
		
	}
	
	public static Node insertAtBegin(Node head, int data) {
		
	
		
		Node inNode = new Node(data);
		
		if(head==null) return inNode;
		
		inNode.next = head;
		head.prev = inNode;
		
		
		return inNode;
	}
	
	
	public static Node insertAtEnd(Node head,int data) {
		
		Node inNode = new Node(data);
		Node temp = head;
		
		if(head==null) return inNode;
		while(temp.next!=null) 
			temp = temp.next;
			
			temp.next = inNode;
			inNode.prev = temp;
		
		return head;
	}
	
	public static Node reverse(Node head) {
		
		Node temp = head;
		
		Node prev = null;
		Node cur = head;
		 
		
		while(cur!=null) {
			
			prev = cur.prev;
			cur.prev = cur.next;
			cur.next = prev;
			cur = cur.prev;
			
		}
		
		
		return prev.prev;
		
		
	}
	
	public static Node deleteAtfront(Node  head) {
		if(head==null || head.next ==null)
			return null;
		
		head = head.next;
		head.next.prev = null;
		
		return head;
	}
	
	public static Node deleteAtEnd(Node head) {
		if(head==null || head.next ==null)
			return null;
		
		Node cur = head;
		while(cur.next!=null) {
			cur = cur.next;
		}
		cur.prev.next = null;			//traverse to the end and having the value of last is at curent and we delete the cur prev next to null to delete that
		cur.prev = null;
		return head;
	}
}
