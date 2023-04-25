package oopsOfAbdulBarik.inputOutputStream;
import java.io.*;
import java.util.Scanner;

class Customer implements Serializable {
	String custID;
	String cname;
	String phn;
	static int count =1;
	
	public Customer() {}
	
	public Customer(String n,String ph) {
		
		custID = "c"+count;
		count++;
		cname = n;
		phn = ph;
	}
	
	
	@Override
	public String toString() {
		return "\nCust Id "+custID+" name : " +cname +" phn " +phn;
	}
	
}

public class SerializeAcustomer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
	/*
		Customer[] c = {new Customer("like","873468"),new Customer("Abhi","92389")};
		try {
		
		ObjectOutputStream obs =new ObjectOutputStream(new FileOutputStream("/Users/chinmayasahu/Desktop/java/fileprogram/customer.txt"));
		
		obs.writeInt(c.length);
		for(Customer i: c)
			obs.writeObject(i);
		
		obs.close();
		
		}catch(IOException e) {}
		
		*/
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("/Users/chinmayasahu/Desktop/java/fileprogram/customer.txt"));
		
		Customer[] c  = new Customer[ois.readInt()];
		
		for(int i=0;i<c.length;i++) {
			
			c[i] = (Customer)ois.readObject();
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of Customer : ");
		String name = sc.nextLine();
		
		
		
		for(int i = 0;i<c.length;i++) {
			if(name.equalsIgnoreCase(c[i].cname))
					System.out.println(c[i]);
			
			System.out.println(c[i]);
		}
		
		ois.close();
		
	
		
		
	}

}
