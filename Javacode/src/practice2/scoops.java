package practice2;
class Subject{
	private String subID;
	private String subName;
	
	Subject(String subID, String subName){
		this.subID = subID;
		this.subName = subName;
		
	}
	
	public String getSubId() {
		return subID;
	}
	public String getSubName() {
		return subName;
	}
	
}



class Student{
	private String sroll;
	private String sName;
	private String sDepartment;
	private String sSubject;
	private String subId;
	
	
	
	
	Student(String sroll,String sName,String sSubject,String subId){
		this.sroll = sroll;
		this.sName = sName;
		
			this.sSubject = sSubject;
			this.subId = subId;
	}
	
	public String getSroll() {
		return sroll;
	}
	
	public String getSname() {
		return sName;
	}
	
	
	
	public String getsDepartment() {
		return sDepartment;
	}
	public void setSdepartment(String sDepartment) {
		this.sDepartment = sDepartment;
	}
	
	public String getsSubject() {
		return sSubject;
	}
	public String getsSubId() {
		return subId;
	}
	
	
	public String toString() {
		return "\nRoll number: " +getSroll()+"\nName : " +getSname()+ "\nSubject : "+getsSubject()+"\nSubject ID : "+getsSubId();
	}
	
	
	
}

public class scoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Subject sub[] = new Subject[5];
		sub[0] = new Subject("MCA101","DSA");
		sub[1] = new Subject("MCA102","PPS");
		sub[2] = new Subject("MCA103","DE");
		sub[3] = new Subject("MCA104","MATH");
		sub[4] = new Subject("MCA105","TC");
		System.out.println(sub[0].getSubId());
		
		Student stud[] = new Student[3];
		stud[0] = new Student("mca21","Rahul",sub[3].getSubName(),sub[3].getSubId());
		stud[1] = new Student("mca22","Avinash",sub[0].getSubName(),sub[0].getSubId());
		stud[2] = new Student("mca23","Devesh",sub[4].getSubName(),sub[4].getSubId());
		
		
		for(Student s:stud) {
			System.out.println(s);
		}
		
			
		
		

	}

}
