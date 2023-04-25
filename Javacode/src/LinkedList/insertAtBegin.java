package LinkedList;


class inNode{
	int data;
	inNode next;
	inNode(int x){
		data = x;
		next = null;
	}
}


public class insertAtBegin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		inNode head = new inNode(10);
		head.next =  new inNode(20);
		head.next.next = new inNode(30);
		
		insertAtBegin(5,head);
		inNode headr  = head;
		traverse(head);
		insertAtsorted(head,20);
		
		System.out.println();
		traverse(headr);
		
		System.out.println();
		inNode t = reverse(head);
		traverse(t);
		
		System.out.println();
		traverse(headr);
		
	}
	
	private static void insertAtsorted(inNode head, int i) {
		// TODO Auto-generated method stub
		
	}

	public static void insertAtBegin(int data,inNode head) {
		
		inNode temp = new inNode(data);
		temp.next = head;
		
//		head.next = temp.next;
//		
	}
	public static inNode reverse(inNode head) {
		
		if (head==null || head.next == null) return head;	
		
		inNode temp = head;
		
	inNode prev = head;
	inNode cur = head.next;
        
        
        while(cur!=null){
         
            inNode tnext =cur.next;
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

	
	
	
	
	
	
	
	
	
	
	
	public static void traverse(inNode head) {
		
		inNode cur = head;
		
		while(cur!=null) {
//		if(cur==null)
//			return;
			
	
			System.out.println(cur.data);
			
			cur = cur.next;
			//traverse(cur.next);
		}
	}

	

}
