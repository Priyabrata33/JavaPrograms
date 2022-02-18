package switchCase;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the 1st number : ");
		int a = sc.nextInt();
		
		System.out.print("enter the second number : ");
		int b = sc.nextInt();
		
		
		System.out.print("enter the operation : ");
		sc.nextLine();
		
		char operation = sc.nextLine().charAt(0);
		
		int result = 0;
		
		
		switch(operation) {
		
			case '+':
				result = a + b;
				break;
			case '-':
				result = a - b;
				break;
			case '*':
				result = a * b;
				break;
			case '/': 
				result = a / b;
				break;
				
			default:
				System.out.println("error");
		}
		
		System.out.println("answer = " + result);

			
	}

}
