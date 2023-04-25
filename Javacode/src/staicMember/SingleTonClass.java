package staicMember;


class CoffeeMechine{
	private float waterQty;
	private float coffeeQty;
	private float milkQty;
	private float sugarQty;
	
	
	static private CoffeeMechine my = null;
	
	static private int count =5;
	public void fillWater(float qty) {
		waterQty = qty;
	}
	public void fillCoffee(float qty) {
		coffeeQty = qty;
	}
	public void fillMilk(float qty) {
		milkQty = qty;
	}
	public void fillSugar(float qty) {
		sugarQty = qty;
	}
	
	
	private CoffeeMechine() {
		waterQty =1;
		coffeeQty =1;
		milkQty =1;
		sugarQty=1;
	}
	

	static public CoffeeMechine getInstance() {
		
			
			if(my==null) {
				my = new CoffeeMechine();
				return my;
		}
			return null;
	}
		
		
	
}
public class SingleTonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CoffeeMechine c1 = CoffeeMechine.getInstance();
		CoffeeMechine c2 = CoffeeMechine.getInstance();
		CoffeeMechine c3 = CoffeeMechine.getInstance();
		CoffeeMechine c4 = CoffeeMechine.getInstance();
		CoffeeMechine c5 = CoffeeMechine.getInstance();
		CoffeeMechine c6 = CoffeeMechine.getInstance();
		System.out.println(c1 + " " + c2 + " " + c3 +" "+c4+ " " +c5 + " " +c6);

	}

}
