package scin;
import java.io.*;

public class monsoon {
public static void main(String[] args) {
  try {
	FileOutputStream f = new FileOutputStream("E:/6th semester/test.txt");
	String s = "hello";
	byte b[]=s.getBytes();
	f.write(b);
	
} catch (IOException e) {
	// TODO Auto-generated catch block
	System.out.println(e);
}
  
  
	}

}


