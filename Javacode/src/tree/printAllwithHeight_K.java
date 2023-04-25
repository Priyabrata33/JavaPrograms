package tree;


public class printAllwithHeight_K {

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
		
		
		int k = 2;
		
		inOrder(root);
		System.out.println();
		print(root,k);
		
		System.out.println();
		bfs(root);

	}

	private static void print(Node root, int k) {
		// TODO Auto-generated method stub
		if(root==null) {
			return ;
		}
		
		if( k==0) {
			System.out.print(root.data+" ");
			return;
		}
		
		print(root.left,k-1);					//print(root.left,--k);		i don't know how it work
		print(root.right,k-1);					//print(root.right,k);
		
		
	}
	public static void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	
	public static void bfs(Node root) {
		
		if(root==null) return;
		
		System.out.print(root.data+ " ");
		
		
		
		
		
		
		
	}

}









