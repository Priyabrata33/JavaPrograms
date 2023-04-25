package tree;

public class childSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node(10);
		root.left = new Node (20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		System.out.println(childSum(root));
		

	}
	public static boolean childSum(Node root) {
		if(root==null) return true;
		if(root.left==null && root.right==null) return true;
		
		int sum = 0;
		if(root.left!=null) sum+=root.left.data;
		if(root.right!=null) sum+= root.right.data;
		
		return (root.data==sum && childSum(root.left)&& childSum(root.right));
		
	}

}
