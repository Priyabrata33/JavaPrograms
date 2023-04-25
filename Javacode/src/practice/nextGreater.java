package practice;
import java.util.*;
public class nextGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {10,15,20,25};
		int n = arr.length;
		int[] ans = new int[n];
		
		Stack<Integer> st = new Stack<>();
		
		
		st.push(n-1);
		ans[n-1] = -1;
		
		for(int  i = n-2;i>=0;i--) {
			
			while(st.isEmpty()==false && arr[i]>=arr[st.peek()])
				st.pop();
			
			ans[i] = st.isEmpty()?-1:arr[st.peek()];
			
			st.push(i);
		}
		
		
		
		System.out.println(Arrays.toString(ans));
		
	}

}
