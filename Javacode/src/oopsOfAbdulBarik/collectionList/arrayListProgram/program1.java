package oopsOfAbdulBarik.collectionList.arrayListProgram;
import java.util.*;
public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>(List.of(12,10, 21, 13, 1111,89, 99, 77, 67, 44, 32));
		
		al1.add(10);
		al1.add(90);
		al1.add(82);
		
		System.out.println(al1);
		

		System.out.println(al1.retainAll(al2));/////
		System.out.println(al1);
		
		
		al1.add(0, 11);
		
		System.out.println(al1);
		al1.addAll(al2);
		System.out.println(al1);
		
		al1.addAll(2, al2);
		System.out.println(al1);
		
		System.out.println(al1.get(5));
		
		System.out.println(al1.remove(1));
		
		System.out.println(al1);
		
		System.out.println(al1.removeAll(al2));
		System.out.println(al1);
		
		
		
	}

}
