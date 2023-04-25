package stack.stackArray;
import java.util.*;

public class multiplyOfNextAAndPrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] A = {5,9,6,8,6,4,6,9,5,4,9};
		
		int[] nga= new int[A.length];
        int[] pga= new int[A.length];
        
        nga[A.length-1] = 0;
        pga[0] = 0;
        
        Stack<Integer> pst = new Stack<>();
        Stack<Integer> nst = new Stack<>();
        
        pst.push(0);
        nst.push(A.length-1);
        
        for(int i=1;i<A.length;i++){
            
            while(pst.isEmpty()==false && A[pst.peek()]<=A[i])
                pst.pop();
                
            pga[i] = pst.isEmpty()?0:pst.peek();
            pst.push(i);
            
            
            
            while(nst.isEmpty()==false && A[nst.peek()]<=A[A.length-i-1])
                nst.pop();
                
            nga[A.length-i-1] = nst.isEmpty()?0:nst.peek();
            nst.push(A.length-i-1);
            
            
        }
        
        int ans  = 0;
        
        for(int i=0;i<A.length;i++){
            
            
            ans = Math.max(nga[i]*pga[i],ans);
        }
        
        System.out.println(Arrays.toString(pga));
        System.out.println(Arrays.toString(nga));
        System.out.println(ans);
		
	}

}
