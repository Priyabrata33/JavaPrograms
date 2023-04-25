package oopsOfAbdulBarik.inputOutputStream;
import java.io.*;


class Student implements Serializable{
	
	int roll;
	String name;
	String dept;
	float avg ;
	public static int x =10;
	public transient int m ;
	
	public Student()
	{
		
		}
	public Student(String n,int r,String d,float a){
		name = n;
		dept = d;
		roll = r;
		avg = a;
		x =500;
		m =10;
	}
	
	public String toString() {
		
		return "Strudent \n" +roll + " \n "+ name +" "+dept + " " +x+  m ; 
				
				
	}
		
}
public class SerializationOOp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
//		FileOutputStream fos = new FileOutputStream("/Users/chinmayasahu/Desktop/java/fileprogram/student6.txt");
//		ObjectOutputStream obs = new ObjectOutputStream(fos);
//
//		Student s = new Student("liku",37,"cse",7.5f);
//		
//		obs.writeObject(s);
//		fos.close();
//		obs.close();
		
		
		
		FileInputStream fis = new FileInputStream("/Users/chinmayasahu/Desktop/java/fileprogram/student6.txt");
		ObjectInputStream obi = new ObjectInputStream(fis);
		
		Student s = (Student)obi.readObject();
		
		System.out.println(s);
		
		fis.close();
		obi.close();
		 
	}

}
