package GFG;

import java.util.Arrays;

public class sendZeroToTheEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {10,5,0,0,8,0,9,0};
		System.out.println(Arrays.toString(arr));
		
		
		
		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==0) {
//				for(int j=i+1;j<arr.length;j++) {
//					if(arr[j]!=0) {								//navie solution
//						int temp = arr[i];
//						arr[i]=arr[j];
//						arr[j]=temp;
//					}
//				}
//			}
//		}
		
		
		int count =0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=0) {
				int temp=arr[i];					//Efficient Solution here
				arr[i]= arr[count];
				arr[count] = temp;
				count++;
	
			}
		}
		
		//operation(arr);
		
		System.out.println(Arrays.toString(arr));
		

	}
//	public static void operation(int[] arr) {
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==0) {
//				for(int j=i+1;j<arr.length;j++) {
//					if(arr[j]!=0) {
//						swap(arr[i],arr[j]);
//					}
//				}
//			}
//		}
//	}
//	private static void swap(int i, int j) {
//		// TODO Auto-generated method stub
//		int temp = i;
//		i=j;
//		j=temp;
//	}
	
	

}
