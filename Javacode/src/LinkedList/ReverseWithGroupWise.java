package LinkedList;


public class ReverseWithGroupWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(1);
		Node n4 = new Node(1);
//		Node n5 = new Node(5);
//		Node n6 = new Node(6);
//		Node n7 = new Node(7);
//		Node n8 = new Node(8);
		
		Node head = n1;
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
//		n4.next = n5;
//		n5.next = n6;
//		n6.next = n7;
//		n7.next = n8;
		
		show(head);
		
		int pos = 2;
//		
//		Node newHead = reverseWithGroup(head,pos);
//		show(newHead);
		
		
		 Node lNode = null;
	      Node rNode = null;
	      int count =1;
	      
	      Node temp = head;
	      
	      int left = 2;
	      int right = 4;
	      
	        while(temp!= null){
	            
	            count++;
	          
	            
	            
	            if(count==left-1) {
	                lNode.next = temp.next.next;
	                lNode.data = temp.next.data;
	            }
	            
	            
	            
	            if(count==right-1) {
	                rNode.next= temp.next.next;
	                rNode.data = temp.next.data;
	                }
	            
	            
	            temp = temp.next;
	        }
	
	        
	       System.out.println(lNode.data);
	        System.out.println(rNode.data);
		
		
	}

	public static void show(Node head) {
		Node cur = head;
		
		while(cur!=null) {
			
		System.out.print(cur.data +"->");
		cur = cur.next;
		
		
		}
		
	}
	
	public static Node reverseWithGroup(Node  head, int k) {
		
		
		Node temp = head;
		Node temp2 = head;
		
		int count =1;
		
		
		if (head==null || head.next == null) return head;	
		
		
		//for the first half of the nodes
		
		Node prev = temp;
		Node cur = temp.next;
		
		
		//1st half of reverse
		
		while(cur!=null) {
		
			
			if(count==k) break;
			
			count++;
			
			Node tnext = cur.next;
			
			cur.next = prev;
			
			
			prev = cur;
			cur = tnext;
			System.out.println();
			
		}
		
		Node nod = reverse(cur);	
		temp.next = nod;
		temp = prev;
		
		
		//show(temp);
		
		return temp;
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
