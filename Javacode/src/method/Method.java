package method;

//BY PARAMETER PASSING IN IT----

public class Method {

	public static void main(String[] args) {
		
		int result = sum1(60 , 50);
		
		System.out.println(result);
		
	}

	static int sum1(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
