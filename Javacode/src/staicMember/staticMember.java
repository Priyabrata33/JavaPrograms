package staicMember;

class Test{
	static int x = 0;
	int y =20;
	
	
	void show() {
		System.out.println(x+ " " +y);
	}
	
	static void display() {
		System.out.println(x);
	}
}

public class staticMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(Test.x);
		
		Test t = new Test();
		t.show();
		t.display();
		
		t.x=30;
		
		
		Test t1 = new Test();
		//t1.y=89;
		t1.show();
		t1.display();
		


	}

}
