package nirojSirProblems;

import java.util.Scanner;

public class Percentile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("enter the number acquired in subjects : ");

		float sub1 = sc.nextFloat();
		float sub2 = sc.nextFloat();
		float sub3 = sc.nextFloat();
		
		
		
		int percentage = (int)(sub1 +sub2 +sub3) / 3;
		System.out.println("the student percentage is :" +percentage + "%");
		
		if(percentage <30) {
			System.out.println("fail");
		}else if(percentage >= 30 && percentage<49) {
			System.out.println("3rd divisionn");
		}else if(percentage >= 50 && percentage<70) {
			System.out.println("2nd divisionn");
		}else if(percentage >= 70) {
			System.out.println("1st divisionn");
		}
		
		
	}

}
