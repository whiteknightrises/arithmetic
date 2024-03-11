package Methods;

import java.util.Scanner;
class acceptUser {
	String name;
	int id;
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.nextLine();
		id=sc.nextInt();
	}
	public void display() {
		System.out.println("Name"+name);
		System.out.println("id"+id);
	}
	
	
	
}

public class Methods {

	public static void main(String[] args) {
		acceptUser a = new acceptUser();
		a.accept();
		a.display();

	}

}
