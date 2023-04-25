package constructor;

import java.util.*;

public class Customer {
	
	Scanner sc = new Scanner(System.in);
	
	
	private int custId;
	private String cName;
	private String cAddress;
	private long cPhone;
	
	Customer c5;
	
	
Customer(int cId,String name,String cAddress){
		
		this.custId = cId;
		this.cName  = name;
		this.cAddress = cAddress;
	}
	
	
	public int getCid() {
		return custId;
	}
	
	public String getName()
	{
		
		return cName;
	}
	
	
	public String getAddress(){
		return cAddress;
	}
	
	public long getCphone() {
		return cPhone;
	}public void setCphone() {
		System.out.println("enter the phone number");
		 cPhone = sc.nextInt();
		
	}
	
	
	Customer(){
		System.out.print("there is no customer here");
	}
	
	
	
	
//	Customer(int cId,String Name, String Adress,int phone){
//		//setCid(cId);
//		getCid(cId);
//		
//		
//		//setName();
//		getName(Name);
//		
//		setAddress(Adress);
//		getAddress();
//		 
//		setCphone(phone);
//		getCphone();
//		
		
	//}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1 = new Customer();
		
		Customer c2 = new Customer(12345,"Priyabrata","Khalari");
		System.out.println("\n"+c2.getAddress());
		
		System.out.println(c2.getCid());
		
		System.out.println();
		
		//Customer c3 = new Customer(12345,"Priyabrata","Khalari",797826775);
		//c3.getCid();
		
		c2.setCphone();
		System.out.println(c2.getCphone());
		
		System.out.println(c2.getName());

	}

}
