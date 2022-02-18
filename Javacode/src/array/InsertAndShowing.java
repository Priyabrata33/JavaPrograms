package array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertAndShowing {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner (System.in);
		
		System.out.println("entre the number of element in the array : ");
		
		int n = sc.nextInt();
		
		
		int[] array = new int[n];
		
		System.out.print("enter the element of the Array : ");
		for (int i = 0;i<n;i++) {
			array[i] = sc.nextInt();
			}
		
		/*for (int num: array) {		//Here we use the enhanced for loop to showing something
			System.out.print(num);
		}
		System.out.println();*/
		
		
		System.out.println(Arrays.toString(array));
		
	}

}
