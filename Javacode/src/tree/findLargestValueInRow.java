package tree;

import java.util.*;

public class findLargestValueInRow {

	public static void main(String[] args) {
		
		
		Node root = new Node(10);
		root.left = new Node(50);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right = new Node(30);
		root.right.right = new Node(70);
		root.right.left = new Node(60);
		root.right.left.left = new Node(80);
		root.right.left.right = new Node(90);
		root.right.left.right.left = new Node(100);
		
		
        
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
       
        //arr.add(root.data);
        while(q.size()>1){  
            int t = q.size();
            int max = Integer.MIN_VALUE;
        
            for(int i=0;i<t;i++){
            Node cur = q.poll();
            
            if(cur==null) {
            	q.offer(null);
            	arr.add(null);
            	break;
            }
           arr.add(cur.data);
            if(cur.left!=null) q.offer(cur.left);
            if(cur.right!=null) q.offer(cur.right);
            }
            
            
        }
        ArrayList<Integer> ans = new ArrayList<>();
        
        ans.add(arr.get(0));
        for(int i=0;i<arr.size()-1;i++) {
        	
       if(arr.get(i)==null)
    	   ans.add(arr.get(i+1));
      
       }
        
       
        

        System.out.println(arr);
        System.out.println(ans);
        
	}

}
