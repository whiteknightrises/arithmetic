package Employee_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
static String ename;
static int eid;
static String edept;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> a = new ArrayList<Employee>();
	   Employee e =null;
 int choice =10; while(choice!=0) {
 System.out.println("1.ADD EMPLOYEE"+"\n"+"2.DELETE EMPLOYEE"+"\n"+"3.VIEW EMPLOYEE"+"\n"+"4.VIEW ALL");
 choice=sc.nextInt();
switch(choice) { 
case 1: 
	System.out.println("ENETR THE NAME");
	ename = sc.nextLine();
	System.out.println("ENETR THE ID");
	eid=sc.nextInt();
	System.out.println("ENETR THE DEPARTMENT");
	edept = sc.nextLine();
	a.add(e);
	e.display();
	
case 2: System.out.println(2); break; 
case 3: System.out.println(3); break;


	 } 
 
 
 }
	

	}

}
