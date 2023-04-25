package inheritance;


class Car{
	
	public void start() {System.out.println("Car is Started");}
	
	public void changeGear() {System.out.println("Gear is changed");}
	
	public void accelerate() {System.out.println("Accelerated the car");}	
}


class LaxuryCar extends Car{
	
	@Override
	public void changeGear() {System.out.println("Automatic Gear is Changed");}
	public void openRoof() {System.out.println("Sun roof is opened");}
	
}


public class example2OfMethodOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car  l = new LaxuryCar();			//here we can call it the property in the super class(car) but we canot call (the overriden property are called)
		l.changeGear();						//the property of the child class property no in the super class
											// the overriden property are called by this 

	}

}
