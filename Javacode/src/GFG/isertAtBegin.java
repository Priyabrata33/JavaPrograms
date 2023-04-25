package GFG;

class Node{
	int data;
	Node next;
	Node(int x){
		data= x;
		next = null;
	}
}
public class isertAtBegin {

	public static void main(String[] args) {
		Node head = new Node(5);
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		
		
		show(head);
		
	
		System.out.println("\n");
		System.out.println("number of node are:- "+count(head));
		
		
		//Insertion of node
		System.out.println();
		Node inNode  = new Node(2);
		insertAtBegin(head,inNode);
		
		System.out.println();
		Node t = new Node(1);
		insertAtBegin(head,t);
		
		System.out.println();
		
		System.out.println("insert at End");
		Node n = new Node(40);
		insertAtEnd(head,n);
		
		
		System.out.println();
		System.out.println("Delete at begin");
		head  = deleteAtBegin(head);
		
		
		System.out.println();
		System.out.println("Delete at end");
		deleteAtEnd(head);
		
		System.out.println();
		System.out.println("insert at End");
		Node c = new Node(50);
		insertAtEnd(head,c);
		
		System.out.println("\nDelete At end");
		deleteAtEnd(head);
		
		
		
		Node any = new Node(8);
		System.out.println("\nInsert At Any");
		insertAtAny(head,any,4);	
		
		
		

		
		System.out.println();
		System.out.println("anypoint");
		insertAtGivenPoint(head,20,4);
		System.out.println();
		
		System.out.println("reverse");
		head = reverse(head);
	
		show(head);
		
		
		
		System.out.println();
		System.out.println("again reverse");
		head = reverse(head);
		show(head);
		
		
		System.out.println();
		System.out.println("check data present or not");
		System.out.println(check(head,20));
		
		
		System.out.println();
		head  = recursiveRev(head);
		show(head);
				
		
	}
	
	
	//for traverse
	public static void show(Node head) {
		Node cur = head;
		
		while(cur!=null) {
			
		System.out.print(cur.data +"->");
		cur = cur.next;
		
		
		}
	}
	
	//for Count
	public static int count(Node head) {
		int count = 1;
		Node cur = head;
		
		while(cur.next!=null) {
			
		
		count++;
		
		cur = cur.next;
		
		}
		
		return count;
	}
	
	//Insertion at begin
	public static void insertAtBegin(Node head , Node inNode) {

		int t = head.data;
		head.data = inNode.data;
		inNode.data = t;
		
		Node cur = head.next;
		head.next = inNode.next;
		inNode.next = cur;
		
	
	head.next = inNode;
	show(head);
		
	}
	
	//Insertion at the end
	
	public static void insertAtEnd(Node head,Node inNode) {
		Node cur = head;
		
		while(cur!=null) {
			if(cur.next == null) {
				cur.next = inNode;
				break;
			}
			cur = cur.next;
		}
		
		show(head);
		
	}
	
	
	//delete at the begin
	public static Node deleteAtBegin(Node head) {
		
		head = head.next;
		show(head);
		
		return head;
		
	}
	
	
	//delete at the end
	
	public static void deleteAtEnd(Node head) {
		Node cur = head;
		while(cur!=null) {
			if(cur.next.next==null){
				cur.next =null;
				break;
			}
			cur = cur.next;
		}
		show(head);
		
	}
	
	
	//Insertion at any position
	
	public static void insertAtAny(Node head,Node inNode,int pos) {
		
		int count = 1;
		Node cur = head;
		
		while(cur!=null) {
			
			if(count==pos-1) {
				Node temp = cur.next;
				cur.next = inNode;
				inNode.next = temp;
			}
			
			count++;
			
			
			cur = cur.next;
		}
		
		show(head);
	}
	
	
	
	
	public static Node reverse(Node head) {
		
					if (head==null || head.next == null) return head;	
					
					Node temp = head;
					
				Node prev = head;
				Node cur = head.next;
			        
			        
			        while(cur!=null){
			         
			            Node tnext =cur.next;
			            cur.next = prev;
			            
			            //updatation
			            
			            prev = cur;
			            cur =tnext;
			              
			        }
			        
			        temp.next = null;
			        temp = prev;
			        
			        return temp;
			        //show(temp);
	}
	
	public static void insertAtGivenPoint(Node head,int data, int pos) {
		
		Node inNode = new Node(data);
		
		Node cur = head;
		
		int count = 0;
		
		while(cur!=null) {
			count++;
			
			if(count==pos-1) {
				Node trmp =cur.next;
				cur.next = inNode;
				inNode.next = trmp;
				break;
			}
			
			cur = cur.next;
		}
		
		show(head);
		
	}
	
	public static boolean check(Node head,int data) {
		Node temp = head;
		
		while(temp!=null) {
			if(temp.data==data) {
				return true;
			}
			temp = temp.next;
		}
		show(head);
		return false;
	}
	
	
	public static Node recursiveRev(Node head) {
		if(head==null || head.next==null)
			return head;
		Node resthead = recursiveRev(head.next);
		Node rectail = head.next;
		
		rectail = head;
		head.next = null;
		return resthead;
	}
	
	
}
