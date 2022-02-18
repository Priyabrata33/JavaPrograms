package ExceptionHandling;

public class thowVSthrows {
	static int area(int l,int b)throws Exception  {
		
		if(l<0||b<0)
			throw new Exception("Negative are not allowed");
		
		int a = l*b;
		
		return a;
	}
	
	static void meth1()throws Exception {
		int a = area(-10,5);
		
		System.out.println(a);
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			meth1();
		}
		catch (Exception e){
			System.out.println(e);
		}
		
	}

}
