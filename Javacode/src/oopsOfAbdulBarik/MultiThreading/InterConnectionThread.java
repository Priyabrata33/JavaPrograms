package oopsOfAbdulBarik.MultiThreading;

class MyData3{
	
	int value;
	
	boolean flag = false;
	
	synchronized public void set(int x) {
		
		while(flag!=false)
			try{wait();}catch(Exception e) {}
		
		value = x;
		flag = true;
		
		notify();
	}
	
	synchronized public int get() {
		int x =0;
		
		while(flag!=true)
			try {wait();}catch(Exception e) {}
		
		x =value;
		
		flag = false;
		notify();
		
		
		
		return x;
	}
}


class Producer extends Thread{
	MyData3 data;						//this is a variable 
	
	Producer(MyData3 d){
		data = d;
	}
	int count;
	
	public void run() {
		
		while(true) {
			
			data.set(count);
			
			System.out.println("Producer "+count);
			count++;
		}
	}
}

class Consumer extends Thread{
	MyData3 data;
	
	Consumer(MyData3 d){
		data = d;
	}
	
	int count =0;
	
	public void run() {
		while(true) {
			count = data.get();
			System.out.println("Consumer " +count);
			
		}
	}
}

public class InterConnectionThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyData3 data = new MyData3();
		
		Producer p=new Producer(data);
		Consumer c =new Consumer(data);
		p.start();
		c.start();

	}

}
