package oopsOfAbdulBarik.classAndObject;

class Subject{
    private String subname;
    private String subcode;
    private int marks;
    private int maxMarks;
    public Subject(String sub,String subcode){
        this.subname=sub;
        this.subcode=subcode;
        maxMarks=100;
    }
    void setmarks(int marks){
      this.marks=marks;
    }
    int getmarks(){
        return marks;
    }  
    String getsubname(){
        return subname;
    }
    String getsubcode(){
        return subcode;
    }
    
    @Override
    public String toString(){
        return "\nSubject Code : "+getsubcode()+" Subject Name : "+getsubname()+" Marks Obtained : "+getmarks()+"/"+maxMarks+"\n";
    }

}
class Student2{
    private String name;
    private int roll;
    private String dept;
    
    private Subject sub[] = new Subject[3];
    
    public Student2(String name,int roll,String dept){
      this.name=name;
      this.roll=roll;
      this.dept=dept;
    }
    public String getname(){
        return name;
    }
    public String getdept(){
        return dept;
    }
    public int getRollNo(){
        return roll;
    }
    public void setSubject(Subject...s){
        for(int i=0;i<s.length;i++)
        sub[i]=s[i];
    }
    public Subject[] getSubject(){
        return sub;
    }
    public void ShowDetails(){
         System.out.println("\nName : "+getname()+" Dept : "+getdept()+" Roll No. : "+getRollNo());
         Subject subs[]=getSubject();
         for(Subject s:subs)
         System.out.println(s.toString());
    }

}

public class StudentChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Subject subs[]=new Subject[3];
		        subs[0]=new Subject("C++","MCA01");
		        subs[0].setmarks(70);
		       
		        subs[1]=new Subject("Python","MCA02");
		        subs[1].setmarks(50);
		       
		        subs[2]=new Subject("Java","MCA03");
		        subs[2].setmarks(90);

		       Student2 happy=new Student2 ("Happy",01,"MCA");
		       happy.setSubject(subs[0],subs[1],subs[2]);
		       happy.ShowDetails();
		       

	}

}
