package recurssion;
import java.util.*;

public class sortOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr  = new ArrayList<>();
		
		arr.add(1);
		arr.add(5);
		arr.add(2);
		arr.add(3);
		arr.add(6);
		arr.add(4);
		arr.add(10);
		
		
		System.out.println(arr);
		sort(arr);
		System.out.println(arr);
		

	}
	
	
	public static void sort(ArrayList<Integer> arr) {
		
		if(arr.size()==1)
			return;
		
		int x = arr.get(arr.size()-1);
			arr.remove(arr.size()-1);
			
		sort(arr);
		insert(arr,x);
	}


	private static void insert(ArrayList<Integer> arr, int x) {
		// TODO Auto-generated method stub
		
		
		if(arr.size()==0 || arr.get(arr.size()-1)<=x) {
			arr.add(x);
			return;
		}
		
		int val = arr.get(arr.size()-1);
		
		arr.remove(arr.size()-1);
		
		
		insert(arr,x);
		arr.add(val);
		
		
	}

}
