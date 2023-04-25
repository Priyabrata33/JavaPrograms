package oopsOfAbdulBarik.inputOutputStream;

import java.io.*;

class Student2{
	String name;
	String dept;
	int roll;
	
}

public class extractValuesFromFile {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("/Users/chinmayasahu/Desktop/java/fileprogram/student.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		
		Student s = new Student();
		s.roll = Integer.parseInt(br.readLine());
		s.name = br.readLine();
		s.dept = br.readLine();
		
		System.out.println("Roll " +s.roll);
		System.out.println("name " +s.name);
		System.out.println("dept " +s.dept);
		

	}

}
