package tree;

import java.util.LinkedList;
import java.util.*;

public class levelOrderTraversal {

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
		
		int height = height(root);
		System.out.println(height);
		
		for(int i=0;i<height;i++) {
		print(root,i);
		}
		
		
		
		Queue<Node> q = new LinkedList<>();
		
		ArrayList<Integer> ar = new ArrayList<>();
		q.add(root);
		
		
		while(q.isEmpty()==false) {
			Node cur = q.poll();
			ar.add(cur.data);
			
			if(cur.left!=null)
				q.add(cur.left);
			if(cur.right!=null)
				q.add(cur.right);
			
		}
		System.out.println();
		System.out.println(ar);
		

	}
	
	
	public static void print(Node root,int k) {
		
		if(root==null) return;
		if(k==0) {
			System.out.print(root.data+" ");
			return;
		}
		
		print(root.left,k-1);
		print(root.right,k-1);	
		
		
		
	}
	
	
	public static int height(Node root) {
		if(root==null)
			return 0;
		
		return Math.max(height(root.left), height(root.right))+1;
		
	}
	
	
	
	
	
	
	
	
	public static void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}

}
