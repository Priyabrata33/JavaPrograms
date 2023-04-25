package LinkedList;


class Node5{
	int data;
	Node5 next;
	
	Node5(int x){
		data = x;
		next = null;
	}
}


public class InsertAtnyporition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node5 n = new Node5(1);
		n.next = new Node5(4);
		n.next.next = new Node5(8);
		n.next.next.next = new Node5(6);
		n.next.next.next.next = new Node5(7);
		
		printList(n);
	}
	
	private static void printList(Node5 head) {
		
		
		Node5 curr = head;
		
		//printList(curr);
		
		while(curr!=null) {
			System.out.print(curr.data+ "->");
			curr = curr.next;
		}
		
	}

	public static Node5 insertAtAny(int in,int p,Node5 head) {
		
		Node5 init  = new Node5(in);
		Node5 temp;
		temp = head;
		
		if(temp==null)
			return init;
			
		while(head!=null) {
			
			
		}
		
		
		return head;
	
		}
	
	

	}
