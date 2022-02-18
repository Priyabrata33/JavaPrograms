package abstrctClass;


abstract class Hospital{
	abstract void name();
	abstract void emergency();
	abstract void admit();
	abstract void doctors();
	abstract void account();						//we can say that these are the property of the hospital that every hospital should override
	abstract void nurse();
	abstract void billing();
	
}

class Kalyani extends Hospital{
	
	@Override
	void name() {
		System.out.println("the name of the hospital is Kalyani");
	}
	@Override
	void emergency() {
		System.out.println("emergrncy number is 2849984598");
	}
	@Override
	void admit() {
		System.out.println("for admit u must be submit the fee");
	}
	@Override
	void doctors() {
		System.out.println("the name of the doctor are : ");
	}
	@Override
	void account() {
		System.out.println("Kalyni account");
	}
	@Override
	void nurse() {
		System.out.println("the nurses are");
	}
	@Override
	void billing() {
		System.out.println("for billing you have to go to the account : ");
	}
	
}

public class HospitalAbstracts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hospital k = new Kalyani();
		k.billing();
		k.account();
		k.name();

	}

}
