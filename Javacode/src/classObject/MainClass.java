package classObject;

class Cat{
	boolean hasFur;
	String breed, name;
	int legs, eyes;
	
	
	public void walk() {
		System.out.println("Cat is Walking");
	}public void eat() {
		System.out.println("Cat is eating");
	}public void description() {
		System.out.println("Cat 1 having "+legs+" legs and "+eyes+" eyes." );
	}
}
class Dog{
	
}

public class MainClass {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		cat1.walk();
		
		cat1.legs = 3;
		cat1.eyes = 2;
		cat1.description();
		
	}

}
