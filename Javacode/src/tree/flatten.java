package tree;

public class flatten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node (2);
		root.right = new Node(5);
		root.left.left = new Node(3);
		root.left.right = new Node(4);
		root.right.right = new Node(6);
		flattent(root);
		
		preOrder(root);

	}
	
	static void flattent(Node root) {
		 if(root==null) return;
	        
         Node temp = root.right;
         Node tempLeft = root.left;
        if(root.left!=null){  
            root.right = root.left;
            root.left =null;
        }
        
        
        flattent(tempLeft);
        add(root,temp);
       flattent(temp);
       
        
	}
	private static void add(Node root, Node temp) {
		// TODO Auto-generated method stub
		if(temp==null) return;
		
		Node cur = root;
		while(cur.right!=null) {
			cur = cur.right;
			
		}
		cur.right = temp;
		
	}

	public static void preOrder(Node root) {
		if(root!=null) {
			
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

}
