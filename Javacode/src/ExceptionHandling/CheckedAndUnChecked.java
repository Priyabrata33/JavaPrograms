package ExceptionHandling;

public class CheckedAndUnChecked {
	static void fun1() {
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	static void fun2() {
		fun1();
	}
	
	  
	static void fun3() {
		fun2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fun3();

	}

}