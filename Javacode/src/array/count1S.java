package array;

class Test{
	public void getd()
{
		System.out.println("deliverd");
		}
}
class test2 extends Test{
	public void getd(){
		System.out.println("time");
		super.getd();
	}
}
public class count1S {
	
	public static void main(String args[]) {
		Test t = new test2();
		t.getd(); 
		
		
	}
}
