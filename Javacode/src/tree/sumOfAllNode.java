package tree;

public class sumOfAllNode {
	static int sum = 0 ; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(4);
		root.left = new Node(8);
		root.left.left = new Node(0);
		root.left.right = new Node(1);
		root.right = new Node(5);
		root.right.right = new Node(6);
//		root.right.left = new Node(60);
//		root.right.left.left = new Node(80);
//		root.right.left.right = new Node(90);
//		root.right.left.right.left = new Node(100);
		
		System.out.println(sum(root));
		System.out.println(numberOfNode(root));
		System.out.println(count(root));
		

	}
	static int count=0;
	
	static int count(Node root) {
		//int count = 0;
		if(root==null) return 0;
		
		int average = sum(root)/numberOfNode(root);
		if(average==root.data) {
			count++;
		}
		count(root.left);
		count(root.right);
		return count;
		
	} 

	static int sum(Node root) {
		if(root==null) return 0 ;
		if(root.left==null && root.right==null)  return root.data;
		return root.data+sum(root.left)+ sum(root.right);
	}
	
	static int numberOfNode(Node root) {
		int count= 0;
		if(root==null) return 0;
		
		return 1+numberOfNode(root.left)+numberOfNode(root.right);
	}
	
}
