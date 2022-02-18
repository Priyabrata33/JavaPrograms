package practice;

import java.util.Arrays;

public class largeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] digits = {1,2,3};
		
		int num =0;
		int i=0;
		int[] ans = new int[digits.length];
		while(i<digits.length) {
			num = num *10;
			num += digits[i];
			i++;
		}
		
		num += 1;
		
		int j=digits.length-1;
		while(num>0||j>=0) {
			ans[j]=num%10;
			num/=10;
			j--;
			
		}
		
		System.out.println(num);

		System.out.println(Arrays.toString(ans));
	}

}
