package logic;

class employees{
	int salary,hours_worked;
	public void getInfo(int salary,int hours_worked) {
		this.salary=salary;
		this.hours_worked=hours_worked;
	}
	public void AddSal() {
		if(salary<5000) {
			salary=salary+1000;
			System.out.println(salary);
		}
		
	}
	public void Addwork() {
		if(hours_worked>6) {
			salary=salary+500;
			System.out.println(salary);
		}
	}
}
public class employee_methods {

	public static void main(String[] args) {
		
		employees e = new employees();
		e.getInfo(500, 8);
		e.AddSal();
		e.Addwork();
		
		
	}

}
