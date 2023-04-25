package oopsOfAbdulBarik.inputOutputStream;
import java.io.*;

class Student5{
	String name;
	String dept;
	int roll;
}

public class serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileOutputStream fos = new FileOutputStream("/Users/chinmayasahu/Desktop/java/fileprogram/student.txt");
		PrintStream ps = new PrintStream(fos);
		
		
		Student5 s = new Student5();
		s.roll = 15;
		s.name = "Priyabrata";
		s.dept = "Mthematics";
		
		ps.println(s.roll);
		ps.println(s.name);
		ps.println(s.dept);
		
		ps.close();
		}catch(FileNotFoundException e) {}
		
		
		
		
	}

}
