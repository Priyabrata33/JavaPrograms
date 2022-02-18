package InnerClasses;
/**
 * 
 * @author chinmayasahu
 * @see abstract class 
 * @since u call it
 * 
 *
 */

abstract class My{
	abstract public void show();
}

/**
 * 
 * @author chinmayasahu
 * {@inheritDoc}
 *
 */


interface my1{
	void show();
}

class Outer3{
	
	/**
	 * 
	 */
	public void display(){
		
		/**
		 * 
		 */
		
		new My(){public void show() {System.out.println("hello"); }}.show();	//create anonymous inner class with anonymous object call of the inner class here
		
		//m.show();
		
		
		new my1() {public void show() {System.out.println("heelo from the Interface"); }}.show();
	}
}



public class AnynomousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer3 o = new Outer3();
		o.display();

	}

}
