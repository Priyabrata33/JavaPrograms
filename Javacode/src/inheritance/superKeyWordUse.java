package inheritance;


class Parent1{
	private long x;
	Parent1(){
		System.out.println("constructor of PARENT without the parameter");
	}
	Parent1(int x){
		System.out.println("constructor of PARENT with the parameter " +x);
	}
}

class Child1 extends Parent1{
	
	Child1(){
		
		System.out.println("Constructor of the CHILD without parameter");
	}
	
	Child1(int x){
		super(9);
		System.out.println("Constructor of CHILD with parameter " + x);
	}
	
}
public class superKeyWordUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Child1 c = new Child1(90);

	}

}
