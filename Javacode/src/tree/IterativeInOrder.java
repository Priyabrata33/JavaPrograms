package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IterativeInOrder {
	
	public static void main(String[] args) {
		
		
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
		
		
		//INORDER
		Node cur = root;
		Stack<Node> s = new Stack<>();
		while(cur!=null ||s.isEmpty()==false) {
			
			while(cur!=null) {
				s.push(cur);
				cur = cur.left;
			}
			cur = s.pop();
			System.out.print(cur.data+ " ");
			cur = cur.right;
			
		}
		
		System.out.println();
		
		//PREORDER
		
		Stack<Node> preO = new Stack<>();
		preO.push(root);
	
		while(preO.isEmpty()==false) {
			Node pre = preO.pop();
			
			System.out.print(pre.data+" ");
			
			if(pre.left!=null) preO.push(pre.left);
			if(pre.right!=null) preO.push(pre.right);
			
		}
		
		
		
		//POSTORDER
		System.out.println();
		Queue<Node> q = new LinkedList<>();
		
		q.offer(root);
		while(q.isEmpty()==false) {
			
			Node pre = q.poll();
			
			System.out.print(pre.data+" ");
			
			if(pre.left!=null) preO.push(pre.left);
			if(pre.right!=null) preO.push(pre.right);
			
			
		}
		
		
	}

}
