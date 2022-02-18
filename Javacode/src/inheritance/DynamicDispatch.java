package inheritance;

class Super{
	public void meth1() {
		System.out.println("Super meth1");	
	}
	public void meth2() {
		System.out.println("Super meth2");
	}
}

class Sub extends Super{
	
	@Override
	public void meth2() {
		System.out.println("Sub Meth2");
	}
	
	public void meth3() {
		System.out.print("sub meth3");
	}
}



public class DynamicDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Super s = new Sub();
		s.meth1();
		s.meth2();
		// s.meth3();		 we can't call that because the reference of the super class doesn't know that the meth3 reference is present or not
		
	}

}
