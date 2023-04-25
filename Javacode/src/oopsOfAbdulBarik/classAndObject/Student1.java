package oopsOfAbdulBarik.classAndObject;
class Student{
	
	private int  roll;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	private int m1,m2,m3;
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	
	public double total(int m1,int m2,int m3) {
		return m1+m2+m3;
		
	}
	public double average(double total) {
		return total/3;
	}
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private String course;
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	//public char grade(double)){
		
	//}
	
	
	
}

public class Student1 {
	
	public static void main(String[] argv) {
		
		Student  s1 = new Student();
		
		s1.setName("Priyabrata Sahu");
		System.out.println(s1.getName());
		
		s1.setRoll(15);
		System.out.println(s1.getRoll());
		
		s1.setM1(10);
		s1.setM2(30);
		s1.setM3(50);
		System.out.println("total " +s1.total(s1.getM1(),s1.getM2(),s1.getM3()));
		
		System.out.println("Average " +s1.average(s1.total(s1.getM1(),s1.getM2(),s1.getM3())));
		
		s1.setCourse("MCA");
		System.out.println(s1.getCourse());
		
		
		
	}
	
}
