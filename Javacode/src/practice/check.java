package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3};
		
		
		
		printSubsequence(0,arr,arr.length);

	}
	static ArrayList<Integer> t = new ArrayList<>();

	private static void printSubsequence(int i, int[] arr, int j) {
		// TODO Auto-generated method stub
		
		if(i==j) {
			System.out.println(t);
			return;
		}
		
		t.add(arr[i]);
		printSubsequence(i+1,arr,j);
		t.remove(arr[i]);
		printSubsequence(i+1,arr,j);
		
	}

	

}
