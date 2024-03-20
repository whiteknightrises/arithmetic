package logic;
class Rectange {
	int length,breadth;
public void area() {
	int k =length*breadth;
	System.out.println(k);
}
public void peri() {
	int c=2*length*breadth;
	System.out.println(c); ;
}
public Rectange(int length, int breadth) {
	this.length = length;
	this.breadth = breadth;
}

}
public class Rectangle_Calc {
public static void main(String[] args) {
	Rectange r = new Rectange(10,5);
	r.area();
	r.peri();
	
		}

}
