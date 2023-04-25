package practice2;

class Generate extends Exception{
	
	public String getMessage() {
		return "enter the currect input";
	}
}


public class ClassExceptionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try { 
			div();
		}
		catch(Generate e) 
		{
			System.out.println(e.getMessage());
			
		}
		
		
	}
	
	public static  int div() throws Generate{

		int a = 10;
		int b = 0;
		int ans;
		
		if(b==0)
			throw new Generate();
		ans = a/b;
			
		return ans;
		
	}

}
