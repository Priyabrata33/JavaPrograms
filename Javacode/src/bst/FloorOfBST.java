package bst;

public class FloorOfBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Node root =  new Node(10);
		root.right = new Node(15);
		root.left = new Node(8);
		root.right.right= new Node(20);
	
		root.right.left = new Node(12);
		root.right.left.right = new Node(14);
	
		
		 int ans= 	floor(root,13);
			System.out.println(ans);
			int ceil = ceil(root,13);
			System.out.println(ceil);
	}
	
	
	public static int  floor(Node root,int val) {
		
		int res=0;
		
		while(root!=null) {
			if(root.data==val)
				return root.data;
			else if(root.data>val)
				root =root.left;
			else {
				res = root.data;
				root = root.right;
			}
			
			
		}
		return res;
		
		
	}
	
	
public static int  ceil(Node root,int val) {
		
		int res=0;
		
		while(root!=null) {
			if(root.data==val)
				return root.data;
			else if(root.data<val)
				root =root.right;
			else {
				res = root.data;
				root = root.left;
			}
			
			
		}
		return res;
		
		
	}
	

}
