package oopsOfAbdulBarik.classAndObject;

class Rectangle{
	double length;
	double breadth;
	
	public double area() {
		return length*breadth;
	}
	
	
	public double perimeter() {
		return 2*(length+breadth);
	}
	
	public boolean square() {
		return length==breadth;
	}
}

public class classAndObject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle R1 = new Rectangle();
		R1.length = 10;
		R1.breadth = 20;
		System.out.println(R1.area());
		System.out.println(R1.perimeter());
		System.out.println(R1.square());

	}

}
