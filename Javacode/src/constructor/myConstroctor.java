package constructor;

class myConstructor{
	int a;
	myConstructor(){
		a = 2;
		System.out.println(a);
	}
	
	
	myConstructor(int v){
		a= v;
		System.out.println(a);
	}
}

public class myConstroctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myConstructor  obj = new myConstructor();
		myConstructor  obj1 = new myConstructor(15);
		

	}

}
