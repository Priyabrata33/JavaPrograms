package tree;



//class LNode{
//	int val;
//	LNode prev;
//	LNode next;
//	LNode(int x){
//		val = x;
//	}
//}

public class ConvertTreeToDLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(20);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right = new Node(30);
		root.right.right = new Node(70);
		root.right.left = new Node(60);
		root.right.left.left = new Node(80);
		root.right.left.right = new Node(90);
		root.right.left.right.left = new Node(100);
		//inOrder(root);
		
		
		

	}
static int x =0;
	
	public static void inOrder(Node root) {
		if(root==null) return;
		
		//Node head = inOrder(root.left);
		
		
	}

}
