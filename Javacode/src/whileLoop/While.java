package whileLoop;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number sum : ");
		
		int n = sc.nextInt();
		int sum = 0;
		
		int i = 1;
		while(i<= n) {
			sum = sum +i;
			i++;
		}
		
		System.out.println(sum);
		
	}

}
