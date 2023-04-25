package tree;
import java.util.*;


public class maximumWidthOfBinaryTree {

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
		
		System.out.println(maximumWidth(root));
		

	}
	
	public static int  maximumWidth(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int ans = 0;
		while(q.isEmpty()!=true) {
			
			int max = 0;
			int n = q.size();
			
			for(int i=0;i<n;i++) {
				
				Node cur = q.poll();
				
				if(cur.left!=null) q.offer(cur.left);
				if(cur.right!=null) q.offer(cur.right);
				
			}
			ans = Math.max(ans,q.size());
		}
		
		return ans;
		
	}

}
