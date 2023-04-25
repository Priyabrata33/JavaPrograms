package staicMember;


class price  {
	static long  x = 10;
	int y = 90;
	
	void show() {
		System.out.println(x+ " " +y);
	}
	
	
	static double Onprice(String city) {
		switch(city) {
		
			case "delhi" :
				return x + x * 0.1;
				
			case "Mumbai" :
				return x+x*0.09;
			}
		
		return 0;
		
	}
}

public class HondaCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(price.Onprice("delhi"));

	}

}
