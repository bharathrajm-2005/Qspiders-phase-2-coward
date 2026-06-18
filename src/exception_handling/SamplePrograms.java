package exception_handling;
import java.util.*;
public class SamplePrograms {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a  = sc.nextInt();
	int b = sc.nextInt();
	int c = 0;
	try {
		c = a/b;
		System.out.println("hi".charAt(10));
	}
	catch(ArithmeticException e) {
//		e.printStackTrace();
		System.out.println("The exception is : "+e.getMessage());
	}
	catch(StringIndexOutOfBoundsException e) {
		e.printStackTrace();
	}
	catch(NullPointerException e) {
		e.printStackTrace();
	}
	catch(Exception e) {
		System.out.println("The exception is : "+e.getMessage());
	}
	
	System.out.println("The ans is : "+c);
	sc.close();
}
}
