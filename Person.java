package logic;
class persons{
	String name;
	int age;
	public persons(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void display() {
		System.out.println("Name of the person is "+name+"  and the age of the person is "+age);
	}
	
}
public class Person {

	public static void main(String[] args) {
		
		persons p = new persons("RAM",25);
		persons q = new persons("TOM",31);
		p.display();
		q.display();
		
		
		
	}

}
