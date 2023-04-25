package tree;
import java.util.*;



	


public class sizeOfBinaryTree {
	
	static ArrayList<Integer> arr = new ArrayList<>();
	
	public  void main(String[] args) {
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
		
		inOrder(root);
		
		System.out.println(arr.size());
		
		
		int x = getSize(root);
		System.out.println(x);
		
	
		System.out.println("maxInt tree " +maxInTree(root));
		
		System.out.println(maxBYIteration(root));
		

	}
	
	
	private static int getSize(Node root) {
		// TODO Auto-generated method stub
		
		if(root==null)
			return 0;
		
		return getSize(root.left)+getSize(root.right)+1;
	}


	public static void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);
			arr.add(root.data);
			inOrder(root.right);
		}
	}
	
	public static int maxInTree(Node root) {
		if(root==null) return Integer.MIN_VALUE;
		
		//int temp = root.data;
		
		return Math.max( root.data,Math.max(maxInTree(root.left), maxInTree(root.right)));
	
	}
	
	public static int maxBYIteration(Node root) {
		
		if(root==null) return Integer.MIN_VALUE;
		Queue<Node> q = new LinkedList<>();
		int ans = 0;
		q.offer(root);
		
		while(q.isEmpty()!=true) {
			
			Node cur = q.poll();
			
			ans = Math.max(cur.data, ans);
			
			if(cur.left!=null)
				q.add(cur.left);
			if(cur.right!=null)
				q.add(cur.right);
			
			
		}
		return ans;
	}
	
	
	

}
