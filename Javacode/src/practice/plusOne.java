package practice;
import java.util.*;


public class plusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] digits = {1,2,3,0,4,5,6,7,8,9};
		
		
		
		int num =0;
		for(int i=0;i<digits.length;i++) {
		
			num = num  *10 + digits[i];
		}
		System.out.println(num);
		
		num =num +1;
		
		
		List<Integer> list =new ArrayList<>();
		
		while(num>0) {
			list.add(num%10);
			num /= 10;
		}
		Collections.reverse(list);
		
		Object[] ans = list.toArray();
		
		System.out.println(Arrays.toString(ans));
		
	}

}
