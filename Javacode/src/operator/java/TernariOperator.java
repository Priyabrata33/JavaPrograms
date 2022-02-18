package operator.java;

public class TernariOperator {

	public static void main(String[] args) {
		int a=3,b=5,c=10;
		int result = 0;
		result = a>b ? a>c ? a : c : b>c ? b : c;
		
		System.out.println("the largest " +result);
		
	}

}
