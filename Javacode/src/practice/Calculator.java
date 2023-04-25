package practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
			
			
			System.out.println("Enter Two Number : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("enter the operation : ");
			
			sc.nextLine();  // HERE WE USE IT BECAUSE AFTER THE AFTER WE PRESSING THE ENTER IT TAKE AUTOMATICALLY THE ENTER AS THE INPUT OF THE GIVEN OPERATION SO WE USE IT HERE TO MAKE THE COMPILER EASY TO ACCESS AND NOT FAULT 
			
			char op =sc.nextLine().charAt(0);
			
			
			
			int result = 0;
		
			switch(op) {
			
			case '+' : result = a+b; 
						break ; 
						
			case '-' : result = a-b;
						break;
						
			case '*' : result = a*b;
							break;
			
			case '/' : result = a/b;
						break;
						
						
		default : 
			
			System.out.println("INVALID INPUT");				
						
			}
			
			
			
			System.out.println("Result of the given OPERATION is : " +result );
		
		
	}

}
