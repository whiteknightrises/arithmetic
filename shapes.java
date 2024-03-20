package accountee;
abstract class shape{
	abstract double perimeter();
	abstract double area();
}
class circle extends shape{
	double r;
	public double perimeter() {
		 return 2*Math.PI*r;
		    }
		    public double area()
		    {
		        return Math.PI*r*r;
		    }
	}
class rectangle extends shape{
	double l;
	double b;
	public double perimeter() {
		 return 2*l*b;
		    }
		    public double area()
		    {
		        return l*b;
		    }
	}

public class shapes {

	public static void main(String[] args) {
		rectangle r = new rectangle();
		r.l=5;
		r.b=10;
		System.out.println(r.area());
	}

}
