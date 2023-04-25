package forLoop;
import java.util.Scanner;

public class XraisedY {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner (System.in);
		
		System.out.println("x");
		int x = sc.nextInt();
		System.out.println("y");
		int y  = sc.nextInt();
		
		int result = 1;
		
		for(int i = 0 ; i< y ; i++) {
			
			result  *= x; 
			
		}
		System.out.println(result);
		

	}

}
