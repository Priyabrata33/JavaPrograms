package InnerClasses;


class Outer2{
	
	public void dislay() {
		class Inner{
			public void show() {
				System.out.println("Hello");
			}
		}
		
		new Inner().show();
		
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer2 o = new Outer2();
		o.dislay();

	}

}
