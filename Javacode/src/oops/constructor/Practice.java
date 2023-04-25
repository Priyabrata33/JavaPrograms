package oops.constructor;

class Cylinder{
	private double radious;
	private double height;
	
	public double getRadious() {
		return radious;
	}public void setRadious(double radious) {
		this.radious = radious;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public Cylinder() {
		setRadious(0);
		setHeight(0);
	}
	
	public Cylinder(int radious) {
		setRadious(radious);
		setHeight(1);
	}
	public Cylinder(int l, int r) {
		setRadious(l);
		setHeight(r);
	}
	
	
	
	public double lidArea() {
		return 2*Math.PI*getRadious()*getRadious();
	}
	
	
	
}

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cylinder c = new Cylinder(60);
		System.out.println(c.lidArea());
		
		

	}

}
