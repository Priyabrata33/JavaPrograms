package practice;

import java.util.Arrays;
import java.util.Stack;

public class prevoiusGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {15, 10,18,12,4,6,2,8};
		Stack<Integer> st = new Stack<>();
		
		st.push(0);
		int[] ans  = new int[arr.length];
		ans[0] = -1;
		for(int i=1 ;i<arr.length;i++) {
//			
//			for(int j = i-1;j>=0;j--) {
//				if(arr[j]>=arr[i]) {
//					ans[i] = arr[j];
//					break;
//				}
//				else {
//					ans[i] = -1;
//				}
//			}
			
			while(st.isEmpty()==false && arr[i]>=arr[st.peek()])
				st.pop();
			
			
			ans[i] = st.isEmpty()?-1:arr[st.peek()];
			
			st.push(i);
			
			
		}
	
		System.out.println(Arrays.toString(ans));
		
		
		
		
		
	}

}
