package LinkedList;



public class maximumTwinSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = new Node(5);
		Node n1 = new Node(4);
		Node n2 = new Node(2);
		Node n3 = new Node(1);
		Node n4 = new Node(0);
		Node n5 = new Node(5);
		
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		printList(head);
		
		Node temp = head;
		
		for(int i = 1;i<=3;i++) {
			temp = temp.next;
		}

int n =2;
		if(n==2) {
			Node t = temp.next;
			
			temp.next = temp.next.next;
			temp.next.next = temp;
		}
		Node t = reverse(temp);
		
		int sum = 0;
		for(int i =1;i<=3;i++) {
			sum = Math.max(sum, t.data+head.data);
			t = t.next;
			head = head.next;
		}
		
		System.out.println();
		System.out.println(sum);
		

	}private static void printList(Node head) {
		
		
		Node curr = head;
		
		//printList(curr);
		
		while(curr!=null) {
			System.out.print(curr.data+ "->");
			curr = curr.next;
		}
		
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

}
