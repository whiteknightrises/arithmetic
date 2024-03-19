package students;

class student{
	String sid;
	String name;
	String phone_number;
	static String course = "JAVA PROGRAM";
	public student(String sid, String name, String phone_number) {
		super();
		this.sid = sid;
		this.name = name;
		this.phone_number = phone_number;
	}
	void display() {
		System.out.println(sid+name+phone_number+course);
	}
	
	
}
public class Students {
	public static void main(String[] args) {
		
student s1 = new student("101","RAM","8745213");
student s2 = new student("102","TOM","87451233");
student s3 = new student("103","MOHAN","4845213");
s1.display();
s2.display();
s3.display();
	}

}
