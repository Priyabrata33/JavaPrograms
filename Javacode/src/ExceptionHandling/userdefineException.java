package ExceptionHandling;

class NegativeException extends Exception{
	@Override
	public String getMessage() {						//we cant use STATIC STRING GETMESSAGE because it is already staticwith in supper class Exception
		return "Be careFul of the -ve inputs";
	}
}

public class userdefineException {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			meth1();
		}
		catch(NegativeException e) {
			System.out.println(e.getMessage());
		}

		
	}
static int area(int l,int b)throws NegativeException  {
		
		if(l<0||b<0)
			throw new NegativeException();
		
		int a = l*b;
		
		return a;
	}
	
	static void meth1()throws NegativeException { 
		int a = area(-10,5);
		
		System.out.println(a);
	}

}
