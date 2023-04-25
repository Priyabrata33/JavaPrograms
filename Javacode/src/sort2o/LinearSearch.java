package sort2o;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entert the number of integer you want to Print : ");
		int n = sc.nextInt();
		
			System.out.println("Eneter the array here: ");
			
			int[] arr = new int[n];
			
			
			for(int i=0;i<n;i++) {
				
				arr[i] = sc.nextInt();
				
			}
			
			System.out.println(Arrays.toString(arr));
			
			System.out.println("enter the element you want to search : ");
			int num = sc.nextInt();
		
			for(int i : arr) {
				if(arr[i]== num)
					System.out.println("the number at : " + i);
			}
			
	}

}
