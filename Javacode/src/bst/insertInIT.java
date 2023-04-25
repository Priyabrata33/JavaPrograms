package bst;



class Node {
	int data;
	Node left,right;
	Node(int x){
		data = x;
		left = null;right=null;
	}
}

public class insertInIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root =  new Node(10);
		root.right = new Node(15);
		root.left = new Node(8);
		root.right.right= new Node(20);
		root.right.left = new Node(12);
		
		root = insert(root,40);
		
		inOrder(root);
		

	}
	public static void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	
	
	public static Node insert(Node root, int val) {
		Node temp = new Node (val);
		Node cur = root;
		Node prev = null;
		while(cur!=null) {
			prev = cur;
			
			if(val>cur.data)
				cur = cur.right;
			else if(val<cur.data)
				cur = cur.left;
			
		}
		
		if(prev==null) return temp;
		
		if(prev.data<val)
			prev.right = temp;
		else if(prev.data>val)
			prev.left = temp;
		
		return root;
	}

}
