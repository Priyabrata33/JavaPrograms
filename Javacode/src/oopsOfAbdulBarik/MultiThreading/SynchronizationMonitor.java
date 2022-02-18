package oopsOfAbdulBarik.MultiThreading;

class MyData {
	public void display(String s) {
		
		synchronized(this){
			
			for(int i=0;i<s.length();i++) {
				System.out.print(s.charAt(i));
			}
		}
	}
}



class Mythread1 extends Thread{
	
	MyData d;
	
	Mythread1(MyData dat){				//in constructor i.e. predefine thing which contain the Mydata type thing in that and d = dat is the 
		d =dat;
		}
	
	public void run() {
		d.display("Hello World");
	}
	
}

class Mythread2 extends Thread{
	
	MyData d;
	
	Mythread2(MyData data){				//in constructor i.e. predefine thing which contain the Mydata type thing in that and d = dat is the 
		d =data;
		}
	
	public void run() {
		d.display("welcome");
	}
	
}

public class SynchronizationMonitor {

	public static void main(String[] args) {
		// TODO Auto-generated method stubx
		
		
		
		MyData d = new MyData();
		
		Mythread1 t1 = new Mythread1(d);
		Mythread2 t2 = new Mythread2(d);
		t1.start();
		t2.start();

	}

}
