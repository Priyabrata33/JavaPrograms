package oopsOfAbdulBarik.inputOutputStream;


import java.io.*;
class Student3{
	int roll;
	String name;
	String dept;
}

public class forInoutDemonstration {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	 
		DataInputStream d = new DataInputStream(new FileInputStream("/Users/chinmayasahu/Desktop/java/fileprogram/student.txt"));
		
		Student3  s = new Student3();
		
		s.roll = d.readInt();
		s.name = d.readUTF();
		s.dept = d.readUTF();
		
		System.out.println(s.roll + " "+s.name+ " " +s.dept);
		d.close();
		

	}

}
