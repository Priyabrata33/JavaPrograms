package GFG;

import java.util.Arrays;

public class RemoveTheDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,20,30,30,30};
		int size = arr.length;
			
		
		int[] ans = removeDuplicate(arr, size);
		System.out.println(Arrays.toString(ans));
		arr = efficientMethod(arr,size);
		System.out.println("by efficient method : "+Arrays.toString(arr));

	}
	
	public static int[] removeDuplicate(int[] arr,int size) {
		int[] temp  = new int[size];
		temp[0]=arr[0];
		
		int j=1;
		
		for(int i=1;i<size;i++) {
			
				if(temp[j-1]!=arr[i]) {
					temp[j]=arr[i];
					j++;
					
				}
		}
		System.out.println(j);
				for(int i =0;i<j;i++) {
					arr[i] = temp[i];
				}
				
			
		
		return arr;
	}
	
	
	
public static int[] efficientMethod(int[] arr,int size) {
	int j =1;
	for(int i=0;i<arr.length;i++) {			/*here the loop check if the previous element is equal to the element we need search here 
	 												then it store the jth place in the array*/
		if(arr[i]!=arr[j-1]) {
			arr[j]= arr[i];
			j++;
		}
	}
	return arr;
}
}
