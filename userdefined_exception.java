package something;
class invalid extends Exception{
	public String toString() {
		return "age less than 18";
	}
}
class number{
	static int numb(int n) throws invalid {
		if(n<0) {
			throw new invalid();
		}
		return n;
		
	}
}

public class hello {

	public static void main(String[] args) {
		try {
			number.numb(-3);
		} catch (invalid e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}



