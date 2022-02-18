package LinkedList;

class InsertHeadNode{
	int data;
	InsertHeadNode next;
	InsertHeadNode(int x){
		data = x;
		next = null;
	}
}

public class InsertionAtBegin {
	
	public static InsertHeadNode insertBegin(InsertHeadNode head, int x) {
		
		InsertHeadNode temp = new InsertHeadNode(x);
		
		temp.next = head;
		return head;
	}

	public static void main(String[] args) {
		
		InsertHeadNode head = null;
		
		head = insertBegin(head,20);
		head = insertBegin(head,10);
		
		
		printList(head);

	}
	
	
private static void printList(InsertHeadNode head) {
		
		
		InsertHeadNode curr = head;
		
		//printList(curr);
		
		while(curr!=null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
		
	}
	
	
	

		
	

}
