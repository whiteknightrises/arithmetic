package logic;
class employee{
	String name,hire_date;
	double salary;
	public employee(String name, String hire_date, double salary) {
		super();
		this.name = name;
		this.hire_date = hire_date;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public String getHire_date() {
		return hire_date;
	}
	public double getSalary() {
		return salary;
	}
	public int Calc() {
		return 2024-Integer.parseInt(hire_date.substring(6));
	}
	public void display() {
		System.out.println("Name is"+" "+name+" Salary is "+salary+" "+"and year of service is "+Calc());
	}
	
}

public class employees {

	public static void main(String[] args) {
		employee e = new employee("Ram","12-02-2000",5000);
		e.display();
	}

}
