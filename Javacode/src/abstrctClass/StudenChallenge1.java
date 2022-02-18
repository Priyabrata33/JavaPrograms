package abstrctClass;

abstract class Shape{
	abstract public double  perimeter();
	abstract public double area();
}


class Circle extends Shape{
	
	private double radious;
	
	Circle(double radious){
		this.radious = radious;
	}
	
	
	public double perimeter() {
		return 2*Math.PI*radious;
	}
	
	public double area() {
		return Math.PI *radious*radious;
	}
}


class Rectangle extends Shape{
	
	private int length;
	private int breadth;
	
	
	Rectangle(int length,int breadth){
		this.length = length;
		this.breadth  = breadth;
	}
	
	
	public double perimeter() {
		return 2*(length + breadth);
	}
	
	public double area() {
		return length * breadth;
	}
}

public class StudenChallenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle s = new Circle(7);
		Rectangle r = new Rectangle(10,5);
		
		System.out.println("Area of the CIRCLE is "+String.format("%.3f",s.area()));
		System.out.println("Area of the RECTANGLE is "+String.format("%.3f",r.area()));
		

	}

}
