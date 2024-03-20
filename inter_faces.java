package logic;
interface inter{
void meth1();
void meth2();
static void meth3() {
	System.out.println("method 3");
}
}
class alpha implements inter{
	public void meth1() {
		System.out.println("method1");
	}
	public void meth2() {
		System.out.println("method2");
	}
	public void meth3() {
		System.out.println("method3 in class alpha");
	}
}

public class inter_faces {

	public static void main(String[] args) {
		alpha a = new alpha();
		a.meth1();
		a.meth2();
		a.meth3();
		inter.meth3();

	}

}
