package oopsOfAbdulBarik.inputOutputStream;

import java.io.*;

class Producer extends Thread{
	
	OutputStream os ;
	
	Producer(OutputStream o ){
	
		os = o;
	}
	
	@Override
	public void run() {
		int count =1;
		while(true) {
			try {
			os.write(count);
			os.flush();
			
			System.out.println("producer " +count);
			
			Thread.sleep(10);
			count++;
			}catch(Exception e) {}
		}
	}
}

class Consumer extends Thread{
	
	InputStream is ;
	
	Consumer(InputStream s ){
	
		is = s;
	}
	
	@Override
	public void run() {
		
		int x;
		while(true) {
			try {
			  x=is.read();
			
			System.out.println("consumer " +x);
			System.out.flush();
			Thread.sleep(10);
			
			}catch(Exception e) {}
		}
	}
}



public class PipedStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PipedOutputStream pos= new  PipedOutputStream();
		PipedInputStream pis= new  PipedInputStream();
		
		try{pis.connect(pos);}catch(Exception e) {}
		
		Producer p = new Producer(pos); 
		Consumer c = new Consumer(pis);
		
		p.start();
		c.start();
		

	}

}
