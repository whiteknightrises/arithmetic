package logic;
class Employee{
	String name,adress,date_of_joining;
	double salary;
	public Employee(String name, String adress, String date_of_joining, double salary) {
		this.name = name;
		this.adress = adress;
		this.date_of_joining = date_of_joining;
		this.salary = salary;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getName() {
		return name;
	}
	public String getDate_of_joining() {
		return date_of_joining;
	}
	public double getSalary() {
		return salary;
	}
	public void display() {
		System.out.println("Name is"+name+"Salary is"+salary+"Adress is"+adress);
	}
	
	
}
public class employees_details {

	public static void main(String[] args) {
		Employee e = new Employee("Ramesh","James Street", "1994",37500.75);
		e.display();
		   
		
	}

}
