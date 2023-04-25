package LinkedList;

public class sortedInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head  = new Node(10);
		Node n1 = new Node (20);
		
		Node n3 = new Node(30);

		head.next = n1;
		n1.next  = n3;
		
		show(head);
		System.out.println();
		head = insertAtsort(head,20);
		 show(head);
	}
	
	
	
	public static Node insertAtsort(Node head,int x) {
		
		Node inNode = new Node (x);
		
		if(head==null) return inNode;
		
		if(x<head.data) { inNode.next = head; return inNode;}
		
		Node cur = head;
		while(cur.next!=null && cur.next.data<x) {
			cur = cur.next;
		}
		inNode.next = cur.next;
		cur.next= inNode;
		
		
		return head;
	}
	
	

	public static void show(Node head) {
		Node cur = head;
		
		while(cur!=null) {
			
		System.out.print(cur.data +"->");
		cur = cur.next;
		
		
		}
		
	}

}

