package array;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the element of the ARRAY");
		int [] arr = new int[10];
		
		
		
		for (int i = 0;i<10;i++) {
			
			arr[i] = sc.nextInt(); //take the array ELEMENT
			
		}
		
		System.out.println("The Given Array is" + Arrays.toString(arr)); //Here We just show the array
		
		System.out.println("enter the element You want to find from the above ARRAY");
		
		int element = sc.nextInt();		//Enter the ELEMENT you want to Search
		
		for(int i=0;i<arr.length;i++) {
			if (element == arr[i]){
				
				int position = i+1; //here it use because we take here bcoz the array position start from the 0th index only 
				
				
				System.out.println("the searching element is on " + position + " position");
			
			}
			
			
		}
		
		

	}

}
