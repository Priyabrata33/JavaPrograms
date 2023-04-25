package constructor;

public class product {

	private int itemno;
	private String iName;
	private int price;
	private int qty;
	
	public int getItemno() {
		return itemno;
	}
	public String getIname() {
		return iName;
	}
	
	public int getPrice() {
		return price;
	}public void setPrice(int price) {
		this.price= price;
	}
	
	public int getQty() {
		return qty;
	}public void setQty(int qty) {
		if(qty<=0)
			System.out.println("there is no product");
		else 
			this.qty = qty;
	}
	
	
	product(){
		System.out.println("there is no product to show : "+getQty());
	}
	
	product(int itemno,String name){
		this.itemno = itemno;
		System.out.println("product no is " +getItemno());
		this.iName = name;
		System.out.println("item NAme is "+getIname());
		
	}
	
	product(int itemno,String name,int price,int qty){
		this.itemno =itemno;
		System.out.println("product no is " +getItemno());
	
		this.iName = name;
	
		System.out.println("item NAme is "+getIname());
		setPrice(price);
	System.out.println("item price is "+	getPrice());
		setQty(qty);
		System.out.println("item qty is "+getQty());
		
	}
	

	
	
	
	
	public static void main(String[] args) {
		product p1 = new product();
		System.out.println();
		product p2 = new product(123212,"sampoo");
		System.out.println();
		product p3 = new product(123212,"sampoo",231,34);
	}
	
}


