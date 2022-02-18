package inheritance;

class Account{
	
	private long  acntNo;
	private String Aname;
	private String phoneNo;
	private String Address;
	private String email;
	private String DOB;
	protected double balance;
	
	
	Account(long acntNo, String Aname,String DOB){
		this.acntNo = acntNo;
		this.Aname = Aname;
		this.DOB = DOB;
		this.balance = 0;
	}
	
	public long getAcntNo() {return acntNo;}
	public String getAname() {return Aname;}
	
	
	public String getPhoneNo() { return phoneNo;}
	public String getAddress() {return Address;}
	public String getEmail() { return email;}
	public String getDOB() { return DOB;}
	public double showBalance() {return balance;}
	
	
	public void setPhone(String phoneNo) {
		if(phoneNo.length()<10) System.out.println("enter the valid phone no of 10 digit");
		else this.phoneNo = phoneNo;
	}
	
	public void setAddress(String Address) {
		this.Address=Address;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
	
}

class SavingAccount extends Account{
		
	

	SavingAccount(long acntNo, String Aname, String DOB) {
		super(acntNo, Aname, DOB);
		// TODO Auto-generated constructor stub
	}

	public void Deposit(int amnt) {
		 balance += amnt; 
	}
	
	public void withDraw(int amount) {
		balance -= amount;
	}
	
	
}

public class spoof1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingAccount a = new SavingAccount(112233,"Priyabrata","03 March 1999");
		a.Deposit(1000);
		System.out.println(a.showBalance());
		System.out.println(a.getAcntNo());
	}

}
