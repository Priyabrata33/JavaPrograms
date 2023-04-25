package stack.stackArray;
import java.util.*;

public class previousGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {40, 30, 20, 10};

		int[] ans= new int[arr.length];
		
		Stack<Integer> st = new Stack<>();
		
		
		ans[0] = -1;
		st.push(0);
		
		for(int i=1; i<arr.length;i++) {
			
			while(st.isEmpty()==false && arr[st.peek()]<=arr[i])
				st.pop();
			
			
			ans[i] = st.isEmpty()?-1:arr[st.peek()];
			
			st.push(i);
		}
		
		
		
		System.out.println(Arrays.toString(ans));
	}

}
