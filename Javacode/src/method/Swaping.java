package method;

public class Swaping {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		swap( a, b);
		
		System.out.println(a+ " " +b); //here the swap doesn't take place because here we just create new object only
		
	}//and here java doesn't obey the pass by reference ......java obey the pass by value thing  that's why here no change in the function 
	
	//here we doesn't changing the original object ....we just creating a new one 
	 static void swap(int a, int b) {
		 int temp;
		 temp = a;
		 a = b;
		 b = temp;
	 }
}
