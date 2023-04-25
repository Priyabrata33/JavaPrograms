package oopsOfAbdulBarik.lambdaExpression;

@FunctionalInterface
interface myLambda{
	void display();
}

@FunctionalInterface
interface myLambda2{
	int add(int a, int b);
}


class MyClass implements myLambda{
	
	@Override
	public void display() {
		System.out.println("welcome");					//by class we can do that
	}
	
}

public class prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myLambda m = () -> {System.out.println("welcome");};
		
		m.display();
		
		myLambda mc = new MyClass();
		mc.display();

		
		myLambda mn= new myLambda(){
			public void display() {
				System.out.println("hello");
			}
		};
		
		mn.display();
		
		myLambda2 m3 = (a,b) -> a+b;
		
		System.out.println(m3.add(9, 11));
		
		
		
	}

}
