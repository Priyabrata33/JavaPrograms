package constructor;

class subject{
	private String subName;
	private String subId;
	private int maxMarks;
	private int obtainMarks;
	
	
	
	public subject(String subName, String subId,int maxMarks) {
		this.subName = subName;
		this.subId = subId;
		this.maxMarks = maxMarks;
	}
	
	
	public String getSubName() {
		return subName;
	}
	
	public String getSubId() {
		return subId;
	}
	
	public int getMaxMarks(){return maxMarks;}
	public int getObtainMarks() {return obtainMarks;}
	
	public void setObtainMarks(int maxMarks) { this.obtainMarks = maxMarks;}
		
	
	
	public boolean isQualified() {
		return obtainMarks >= maxMarks/10*4; 
	}
	
	
	
	public String toString() {
		return "\n The subject name : " +getSubName()+ "\n the Subject id :" +getSubId()+"\n maxMarks: "+getMaxMarks()+"\n ObtainMarks: "+getObtainMarks();
	}
	
	
}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subject s[] = new subject[3];
		
		s[0] = new subject("DSA", "MCA101",100);
		s[1] = new subject("OS", "MCA102",100);
		s[2] = new subject("ML","MCA102",100);
		
		s[0].setObtainMarks(23);
		System.out.println(s[0].isQualified());
		
		for(subject s1:s) {
			
			System.out.println(s1);
		}
		
	}

}
