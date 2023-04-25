package oopsOfAbdulBarik.MultiThreading;

class WhiteBoard{
	
	String text;
	
	int noOfStudent =0;
	
	int count =0;
	
		synchronized	void write(String text) {
		
				while(count!=0) {
					try{wait();}catch(Exception e) {};
				}
				System.out.println("Teacher is writing "+text);
				this.text = text;
				
				count = noOfStudent;
				
				notify();
			}
	
		synchronized String read() {
		
				while(count==0)
					try {wait();}catch(Exception e) {}
				
				count--;
				notify();
				return text;
				
			}
			
			int attendance() {
				return noOfStudent++;
			}
			
		}


class Teacher extends Thread{
	
	WhiteBoard w;
	String[] text = {"Java is A language","Java is oops","It content Multithreading","end"};
	
	Teacher(WhiteBoard wh,String Text){
		w=wh;
		//this.text = Text;
	}
	
	
	@Override
	public void run() {
		for(int i=0;i<text.length;i++) {
			w.write(text[i]);
		}
	}
	
}


class Student extends Thread{
	WhiteBoard w;
	String name;
	String Text;
	
	Student(WhiteBoard wh,String name){
		w = wh;
		this.name = name;
		w.attendance();
		
	}
	
	@Override
	public void run() {
		
		do {
			
		Text = w.read();
		System.out.println(name+" "+w.read());
		System.out.flush();
		}while(!Text.equals("end"));
		
	}
}



public class ClassRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WhiteBoard w = new WhiteBoard();
		Teacher t = new Teacher (w,"helow");
		Student s1 = new Student(w,"s1"); 
		t.start();
		s1.start();
		

	}

}
