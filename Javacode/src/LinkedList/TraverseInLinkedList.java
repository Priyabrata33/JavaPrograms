 package LinkedList;

class Node1{
	int data ;
	Node1 next;
	Node1(int x){					//here we create a node where we store the data and the node of the or reference of the next node the constructor have the value of the node and the next reference of the value
		data = x;
		next =null;
	}
}

public class TraverseInLinkedList {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		Node1 n1 = new Node1(10);
		Node1 n2 = new Node1(30);
		Node1 n3 = new Node1(40); 
		
		n1.next = n2;
		n2.next = n3;
		
		
		

		traverse(n1);
		
		insortedAtSorted(n1, 25);
		
	}
	
	private static Node1 insortedAtSorted(Node1 n1, int i) {
		// TODO Auto-generated method stub
		Node1 head = n1;
		
		while(head!=null) {
			//if(head.data)
		}
		
		return n1;
	}

	public static int traverse(Node1 head) throws Exception{
		int count =0;
		
		Node1 cur = head;
		
		while(cur!=null) {
		if(cur==null)
			return 0;
			
			//System.out.println(cur+ "  "+ cur.next) ;
			
			System.out.print(cur.data+"->");
			
			cur = cur.next;
			count++;
			//traverse(cur.next);
			
			
		//}
	}
		return count;
	}

}
