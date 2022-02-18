package LinkedList;

class Node{
	int data ;
	Node next;
	Node(int x){					//here we create a node where we store the data and the node of the or reference of the next node the constructor have the value of the node and the next reference of the value
		data = x;
		next =null;
	}
}

public class CreationOfLinkedListAndDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		
		
		printList(head);
		
		recurssivePrintList(head);

	}

	private static void recurssivePrintList(Node head) {
		if(head==null)
			return;
		System.out.print(head.data+ " ");
		
//		System.out.print(head+ " ");              here it return the address of the node of the given NODE data

		recurssivePrintList(head.next);
	}

	private static void printList(Node head) {
		
		
		Node curr = head;
		
		//printList(curr);
		
		while(curr!=null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
		
	}

}
