package stack.stackArray;
import java.util.*;

public class nextGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long[] arr = {1 ,3 ,2 ,4};
		int n = arr.length;
		 Stack<Integer> st = new Stack<>();
		long[] ans = new long[n];
        ans[n-1] = -1;
        st.push(n-1);
       
        
        
        for(int  i = n-2;i>=0;i--){
            
            while(st.isEmpty()==false && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            ans[i] = st.isEmpty()?-1:arr[st.peek()];
            st.push(i);
        }
		
		System.out.println(st);
		System.out.println(Arrays.toString(ans));
		
	}

}
