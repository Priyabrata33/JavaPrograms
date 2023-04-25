package stack.stackArray;
import java.util.*;

public class prevSmallerNextSmaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,4};
		Stack<Integer> pst = new Stack<>();
		Stack<Integer> nst = new Stack<>();
		int n = arr.length;
		int pos[] = new int[arr.length];
		int nos[] = new  int[arr.length];
		
		
		pos[0] = -1;
		nos[n-1] = n;
		nst.push(n-1);
		pst.push(0);
		int res = 0;
		
		for(int i = 1 ; i <n;i++) {
			
			while(pst.isEmpty()==false && arr[i]<=arr[pst.peek()]) {
				pst.pop();
			}
			
			pos[i] = pst.isEmpty()?-1:pst.peek();
			
			pst.push(i);
			
			
		}
		
		for(int i = n-2;i>=0;i--) {
			while(nst.isEmpty()==false && arr[i]<=arr[nst.peek()]) {
				nst.pop();
			}
			
			nos[i] = nst.isEmpty()?n:nst.peek();
			nst.push(i);
		}
		
		System.out.println(Arrays.toString(pos));
		System.out.println(Arrays.toString(nos));
		
		for(int i = 0;i<arr.length;i++) {
			int cur = arr[i];
			cur += (i-pos[i]-1)*arr[i];
			cur += (nos[i]-i-1)*arr[i];
			
			res = Math.max(res, cur);
			System.out.println(cur);
		}

		
		System.out.println(res);
	}

}
