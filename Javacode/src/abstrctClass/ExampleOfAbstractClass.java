package abstrctClass;


abstract class Super{
	Super(){
		System.out.println("Super Constructor");
	}
	
	public void meth1() {
		System.out.println("Super math1");
	}
	
	abstract void meth2();
	
}

class Sub extends Super{
	
	@Override
	void meth2() {
		System.out.println("Sub Meth2 and its inherited and its an abstract class");
	}
}






public class ExampleOfAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Super s = new Sub();
		
		s.meth1();
		s.meth2();

	}

}
