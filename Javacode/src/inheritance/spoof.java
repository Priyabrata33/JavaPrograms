package inheritance;
class Circle{
	public double radious;
	
	public double area() {
		return Math.PI*radious*radious;
	}
}

class Cylinder extends Circle{
	
	public double height;
	
	public double volume(){
		return area()*height;
	}
	
}

public class spoof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cylinder c = new Cylinder();
		
		c.radious = 12;
		c.height = 12;
		
		System.out.print(c.volume());

	}

}
