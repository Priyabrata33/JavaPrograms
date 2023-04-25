package practice;

import java.util.*;
//impor

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "aabbcdb";
		String b = "aabbcbd";
		
		
		
		boolean isAnagram = false;
		
		if(a.length()==b.length()){
			int[] arr = new int[256];
			
			
			for(char ch: a.toCharArray()) {
				int index = (int) ch;
				arr[index]++;
				
			}
			System.out.println(Arrays.toString(arr));
			
			for(char ch: b.toCharArray()) {
				int index = (int) ch;
				arr[index]--;
			}
			System.out.println(Arrays.toString(arr));
			
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!= 0) {
					isAnagram = false;
					break;
				}
			}
			System.out.println(isAnagram);
			
			if(isAnagram) {
				System.out.println("anagram");
			}else {
				System.out.println("notAnagram");
			}
			
			
		}
		
		
		
		
	}

}
