
//we have a name error between data input stream and data outputStream


package oopsOfAbdulBarik.classAndObject;
import java.io.*;


class Student3{
	int roll;
	String name;
	String dept;
}


public class DataInputStreamWithStudentClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	
		DataOutputStream d = new DataOutputStream( new FileOutputStream("/Users/chinmayasahu/Desktop/java/fileprogram/student.txt"));
		
		Student3 s = new Student3();
		s.roll=10;
		s.name = "priyabrata Sahu";
		s.dept = "Computer";
		
		d.writeInt(s.roll);
		d.writeUTF(s.name);
		d.writeUTF(s.dept);
		
		d.close();
		

	}
		

	}


