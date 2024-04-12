package scin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class comparator {

	public static void main(String[] args) {
		ArrayList<Employee> a = new ArrayList<Employee>();
		Employee e = new Employee("ramu",101,20);
		Employee e1 = new Employee("situ",102,25);
		Employee e2 = new Employee("veeru",103,28);
		Employee e3 = new Employee("krish",104,30);
		Employee e4 = new Employee("mohnish",105,33);
		Employee e5 = new Employee("manu",106,34);
		a.add(e);
		a.add(e1);
		a.add(e2);
		a.add(e3);
		a.add(e4);
		a.add(e5);
		 Collections.sort(a, new NameComparator());
		 Iterator<Employee> itr = a.iterator(); 
		  while(itr.hasNext()) {
		  System.out.println(itr.next()); 
		  }
	}
	
public static class Employee{
	 String ename;
	int eid;
	int eage;
	public Employee(String ename, int eid, int eage) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.eage = eage;
	}
	public void display() {
		System.out.println("name is "+ename+" id is "+eid+" Age is"+eage);
	}
	
	  public String toString(){ 
		  return "ename='" + ename + '\'' +
	  ", eid=" + eid + ", eage=" + eage ; }
	 
}
public static class AgeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.eage<o2.eage) {
			return 1;
		}
		else if(o1.eage>o2.eage) {
			return -1;
		}
		else
		return 0;
	}
	
}
public class IdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.eid<o2.eid) {
			return 1;
		}
		else if(o1.eid>o2.eid) {
			return -1;
		}
		else
		return 0;
	}
	
}	
public static class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.ename.compareTo(o2.ename);
    }
}


}	
	
