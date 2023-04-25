package InnerClasses;


class Outer4{
	static int x =30;
	int y = 10;
	
	static class Inner{
		
		void show() {
			System.out.println(x);  //we can access the y value because the static class only use the static variable / property only.
		}
		
	}
}

public class StaticInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer4.Inner i = new Outer4.Inner();			//we directly access the value of the inner static class without creating the object of the outer class 
		i.show();

	}

}
