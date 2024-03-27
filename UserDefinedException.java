package Methodoverloading;

class negative extends Exception{
	public String toString() {
		return "it is a negative number";
	}
}
class number {
	public static int num(int a) throws negative {
		if(a<0) {
			throw new negative();
		}
		return a;
		
	}
	
}

public class UserDefinedException{

	public static void main(String[] args)  {
		try {
			number.num(-5);
		}
		catch(negative e){
			System.out.println(e);
		}
	}
	}