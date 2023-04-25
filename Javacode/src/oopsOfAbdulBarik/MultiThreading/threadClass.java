package oopsOfAbdulBarik.MultiThreading;

class MyThread extends Thread{
	
	MyThread(String name){
		super(name);					//by this we call the constructor of the Thread class having the name property with that 
	}
	@Override							//It override from the thread class
	public void run() {
		int count=1;
		while(true) {
			System.out.println(count++);
			
//			try {
//			Thread.sleep(1000);
//			}
//			catch(InterruptedException e) {
//				System.out.println(e);
//			}
		}
	}
}

public class threadClass extends Thread{
	@Override
	public void run() {
		int i=1;
		while(true) {
			System.out.println(i+"Hello");
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		threadClass t =  new threadClass();
		t.start();
		System.out.println("priority   "+t.getPriority());
		System.out.println("Id         "+t.getId());
		System.out.println("state      "+t.getState());
		System.out.println("Name       "+t.getName());//Automatically it give the name the thread  as 0
		
		System.out.println("\n");
		
		MyThread m = new MyThread("My Thread 1");
		m.setDaemon(true);
		//m.setPriority(MAX_PRIORITY);
		
		System.out.println("id          "+m.getId());
		System.out.println("priority    "+m.getPriority());
		System.out.println("Name        "+m.getName());
		System.out.println("state       "+m.getState());
		System.out.println(m.isAlive());
		System.out.println("state      "+m.getState());
		
		m.setDaemon(true);
		m.start();
		//m.interrupt();
		
		
		
		
		
		
//		int i=1;
//		while(true) {
//			System.out.println(i+"World");
//			i++;
//		}

	}

}
