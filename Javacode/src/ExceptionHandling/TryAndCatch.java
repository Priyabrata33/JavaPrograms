package ExceptionHandling;
//import java.rmi.AccessException;
import java.util.Scanner;

public class TryAndCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("enter two number");
		int a ,b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		try {
			
			int c = a/b;
			System.out.println("Ans = " +c);
			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println("bye");
		

	}

}
