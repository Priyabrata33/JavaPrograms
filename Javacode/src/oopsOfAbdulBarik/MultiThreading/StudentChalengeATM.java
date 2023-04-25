package oopsOfAbdulBarik.MultiThreading;

class ATM{
	

	
	synchronized public void chckBalance(String name) {
		  
			 System.out.print(name+" Using the atm");
			 try {Thread.sleep(1000);}catch(Exception e) {};			//we write this for the amount slip of the ATM
			 System.out.println(" Balance "+name);
		 
	}
	
	synchronized public void withdrawBalance(String name,int amount) {
		 {
			System.out.print(name+ " withdraw ammount of " +amount);
			try {Thread.sleep(1000);}catch(Exception e) {};
			System.out.println(" ");
		}
	 
	}
}


class Customer extends Thread{
	
	ATM atm;
	private String name;
	int amount;
	
	Customer(ATM atm,String name,int amount){
		this.name = name;
		this.atm = atm;
		this.amount = amount;
	}
	
	
	public void useATM() {
		atm.chckBalance(name);
		atm.withdrawBalance(name,amount);
	}
	
		public void run() {
			
			useATM();
		
	}
	
	
}
public class StudentChalengeATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ATM at = new ATM();
		Customer c1 = new Customer(at,"c1",100);
		Customer c2 = new Customer(at,"c2",200);
		Customer c3 = new Customer(at,"c3",300);
		Customer c4 = new Customer(at,"c4",400);
		Customer c5 = new Customer(at,"c5",500);
		Customer c6 = new Customer(at,"c6",600);
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		c6.start();

	}

}
