package encapsulation.introOfEncapsulation;

import encapsulation.student.Student;

public class introGetterAndSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		
		s1.setName("Priyabrata sahu");
		System.out.println(s1.getName());
		
		s1.setAge(21);
		System.out.println(s1.getAge());
	}

}
