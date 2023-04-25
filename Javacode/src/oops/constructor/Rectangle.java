package oops.constructor;

class Rectangle1{
	
	private double length;
	private double breadth;
	
	public  double getLength() {
		return length;
	}public void setLength(double l) {
		if(length < 0) this.length =0;
		else this.length=l;
	}
	
	public double getBreadth() {
		return breadth;
	}public void setBreadth(int breadth) {
		if(breadth<0) this.breadth=0;
		else this.breadth = breadth;
	}
	
	public Rectangle1() {
		setLength(1);
		setBreadth(1);
	}
	public Rectangle1(int l, int b) {
		setLength(l);
		setBreadth(b);
	}
	
	public Rectangle1(int s) {
		setLength(s);
		setBreadth(s);
	}
	
	
	public double area() {
		return getLength()*getBreadth();
	}
	
	public double perimeter() {
		return 2*(length+breadth);
	}
	
	
	public void square(double s) {
		System.out.println("it is asquare");
	}
	
	
	
}

public class Rectangle {

	public static void main(String[] args) {
		
		Rectangle1 r= new Rectangle1(5);
		System.out.println("Area = "+ r.area());
		
	}
	
}
