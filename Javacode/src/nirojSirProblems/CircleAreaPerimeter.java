package nirojSirProblems;

import java.util.Scanner;

public class CircleAreaPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Radius of the given circle : ");
		float r = sc.nextFloat();
		
		Float area = 22/7 * r * r;
		Float perimeter = 2 * 22/7 *r;
		
		
		System.out.println("Area is : " +area+ "      perimeter : " +perimeter);
		
		
		
		
	}

}
