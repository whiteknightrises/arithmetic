package methods;
import java.util.*;

public class even_odd {
	static int no;
	static void Check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		no = sc.nextInt();
		if(no%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
}
	public static void main(String[] args) {
		Check();

	}

}
