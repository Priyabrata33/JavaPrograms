package inheritance;


class Rectangle{
	private int length;
	private int breadth;
	int x =10;
	
	public int getLength() {
		return length;
	}
	
	public int getBreadth() {
		return breadth;
	}
	
	Rectangle(){
		length = breadth = 1;
		
	}
	
	Rectangle(int length,int breadth){
		this.length = length;
		this.breadth = breadth;
	}
}


class Cuboid extends Rectangle{
	private int height;
	int x= 20;
	
	Cuboid(){
		
		height = 1;
	}
	
	Cuboid(int height){
		super(1,1);
		this.height = height;
	}
	
	Cuboid(int length,int height,int breadth){
		
		
		super(length, breadth);							//	{super(length , breadth) = Rectangle(length, breadth)}
		
		this.height = height;
		
		
	}
	
	
	public double volume() {
		return height*getLength()*getBreadth();
	}
	
	public void display() {
		System.out.println(super.x);				//here "super" keyword refer to the PARENT class property and method.
		
		System.out.println(this.x);					//here "this"  keyword refer to the CURRENT class property and method.
	}

}
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cuboid cube = new Cuboid(5,5,5);
		System.out.println(cube.volume());
		cube.display();
		

	}

}
