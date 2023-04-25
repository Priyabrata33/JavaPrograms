package tree;
import java.util.*;

public class spiralTraversal {

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
		
		
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		ArrayList<Integer> ar = new ArrayList<>();
		
		s1.push(root);
		while(s1.isEmpty()!=true || s2.isEmpty()!=true) {
			
			while(s1.isEmpty()!=true) {
				Node cur =s1.pop();
				
				if(cur!=null) {
					ar.add(cur.data);
					
					if(cur.left!=null) s2.push(cur.left);
					if(cur.right!=null) s2.push(cur.right);
					
				}
			}
				
			while(s2.isEmpty()!=true) {
					
				Node cur =s2.pop();
				if(cur!=null) {		
					ar.add(cur.data);
					
					if(cur.right!=null) s1.push(cur.right);
					if(cur.left!=null) s1.push(cur.left);
					
				
					
				}
				
			}		
				
		}
		
		System.out.println(ar);
		
		
		
	}

}
