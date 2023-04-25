package LinkedList;



class mNode{
	int data;
	mNode next;
	mNode(int x){
		data = x;
		next = null;
	}
}

public class addOne {

	public static void main(String[] args) {
		
		
		mNode head = new mNode(4);
		head.next =  new mNode(5);
		head.next.next = new mNode(6);
		
		
		
		head = reverse(head);
		show(head);
		
		boolean f = true;
		mNode cur = head;
		while(cur!=null & f==true) {
			
			if(cur.data==9 && cur.next == null) {
				cur.data = 0;
				mNode temp = new  mNode(1);
				temp.next = head;
				head = temp;
				cur = cur.next;
				
			}
			else if(cur.data ==9) {
				cur.data = 1;
				cur = cur.next;
				
			}
			else {
				cur.data  = cur.data+1;
				cur = cur.next;
				f = false;
			}
			
		}
		head = reverse(head);
		show(head);
		
		
		}
	
	public static mNode addOne(mNode head) 
    { 
        //code here.
		mNode cur = head;
		
		
				
        return head;
    }
	
	public static void show(mNode head) {
		mNode cur = head;
		
		while(cur!=null) {
			
		System.out.print(cur.data +"->");
		cur = cur.next;
		
		
		}
	}
	
	
	
	public static mNode reverse(mNode head) {
		
		mNode temp = head;
		mNode prev = head;
		mNode cur = head.next;
		
		
		while(cur!=null) {
			mNode tnext = cur.next;
			cur.next = prev;
			
			prev = cur;
			cur = tnext;
			
		}
			
			temp.next = null;
			temp = prev;
		
			return temp;
	}

}
