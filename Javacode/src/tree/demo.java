package tree;

class Node{
	Node left;
	Node right;
	int data;
	Node(int x){
		data = x;
		left = null;
		right = null;
	}
}
public class demo {

	
	public static void main(String args[]) {
		
		Node root = new Node(10);
		root.left = new Node (20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		
		System.out.println("InOrder");
		inOrder(root);
		
		System.out.println();
		System.out.println("PreOrder");
		preOrder(root);
		
		System.out.println();
		System.out.println("PostOrder");
		postOrder(root);
		
		System.out.println();
		System.out.println(height(root));
		
		System.out.println();
		rder(root);
		
		
	}
	
	
	public static void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	
	public static void preOrder(Node root) {
		if(root!=null) {
			
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public static void postOrder(Node root) {
		if(root!=null) {
			postOrder(root.left);
			
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	}
	
	public static int height(Node root) {
		if(root==null) {
			return 0;
		}
		return (Math.max(height(root.left), height(root.right))+1);
	}
	
	public static void rder(Node root) {
		if(root!=null) {
			
			postOrder(root.right);
			postOrder(root.left);
			System.out.print(root.data+" ");
		}
	}
	
}
