package practice2;
class Super {
	void display() {
		System.out.println("Hello");
	}
	
}

class Sub extends Super{
	void display() {
		System.out.println("WELCOME TO PATNA");
	}
}

public class Dynamic_dispatch {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Super s = new Sub();
		s.display();    //it will call the method that are in the object class of the created object 

	}

}
