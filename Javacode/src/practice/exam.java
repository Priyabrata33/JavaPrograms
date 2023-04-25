package practice;
import java.util.*;

public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		int min  = sc.nextInt();
		int max = sc.nextInt();
		
		int x = max-min;
		
		int[] c = new int[N];
		for(int i=0;i<N;i++) {
			c[i] = sc.nextInt();
		}
		
		int count =0;
		
		for(int i=0;i<N;i++) {
			int sum = 0;
			for(int j = i+1;j<N;j++) {
				sum = c[i]+c[j];
				
				if(sum<=max && sum>= min)
					count++;
					
			}
		}
		
		System.out.print(count);

	}

}
