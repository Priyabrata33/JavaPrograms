package interfaceExamles;

interface Member{
	void callBack();
}

class Store{
	
	Member[] mem = new Member[100];   //we can call that we can call the array in the here we call the array of interface in that.
	
	int count =0;
	void register(Member m) {
		mem[count++] = m;
	}
	
	void invite() {
		for(int i=0;i<count;i++) {
			mem[i].callBack();
		}
	}
}

class Customer implements Member{
	String name;
	Customer(String name){
		this.name = name;
	}
	
	//Store[] s = new Store[];
	
	@Override
	public void callBack() {
		System.out.println("Ok,I will visit "+name);
	}
}

public class StudentChallange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Store s = new Store();
		Customer c1 = new Customer("Liku");
		Customer C2 = new Customer("Buna");
		
		s.register(c1);
		s.register(C2);
		
		s.invite();
		
	}

}
