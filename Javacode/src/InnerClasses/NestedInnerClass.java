package InnerClasses;


class Outer{
	int x = 10;
	
	class Inner{
		
		int y = 20;
		
		public void innerDisplay() {
			System.out.println(x+ " " +y);
		}
	}
	
	
	void OuterDisplay() {
		Inner  i =  new Inner();
		i.innerDisplay();
	}
}

public class NestedInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer o = new Outer();
		o.OuterDisplay();
		
		
		Outer.Inner oi = new Outer().new Inner();
		
		oi.y = 40;
		
		System.out.println(oi.y);			//y is inside of the inner class
		
		oi.innerDisplay();
		
	}

}
