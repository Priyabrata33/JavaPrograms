package interfaceExamles;

import java.util.Arrays;

interface Test{
	void meth1();
	void meth2();
}

class My implements Test{
	@Override
	public void meth1() {
		System.out.println("My meth1");
	}
	
	@Override
	public void meth2() {
		System.out.println("My meth2");
	}
	
	public void meth3() {
		System.out.println("my meth3");
	}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Test t2[] = new Test[5];
		System.out.println(Arrays.toString(t2));
		Test t = new My();
		
		t.meth1();
		t.meth2();
		
		
		My m = new My();
		m.meth3();

	}

}
