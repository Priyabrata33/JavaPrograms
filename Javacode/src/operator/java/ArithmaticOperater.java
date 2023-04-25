package operator.java;
import java.util.Scanner;
	
public class ArithmaticOperater {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter value of a =");
		int a = sc.nextInt();
		System.out.println("enter value of b =");
		int b = sc.nextInt();
		
		
		int c = a + b;
		
		System.out.println("c = " +c);
		
	}

}
