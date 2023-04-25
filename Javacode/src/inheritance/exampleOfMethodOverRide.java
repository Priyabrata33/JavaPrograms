package inheritance;



class TV{
	public void switchON() {
		System.out.println("TV is Switch on");
	}
	public void changeChannel() {
		System.out.println("Channel is changed");
	}
}


class SmartTv extends TV{ 
	@Override											//Annotation is added
	public void switchON() {
		System.out.println("SmartTV is switch on");
	}
	
	@Override											//Annotation
	public void changeChannel() {
		System.out.println("SmartTv channel changed");
	}
	
	public void browse() {
		System.out.println("Smart  can browse in web");
	}
}

public class exampleOfMethodOverRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TV t = new SmartTv();
		
		//t.browse();     we can call the browse method because of the TV reference t can't have this.   that means we r not aware of this thing
		
		t.changeChannel();

	}

}
