package practice;

import java.util.Scanner;

public class USDtoRUPEE {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the currency : ");
		float rupee = sc.nextFloat();
		
		double dollar = rupee * 74.15 ;
		
		System.out.println("rupee : " +rupee+ "  dollar : " +dollar+ "$");
		

	}

}
