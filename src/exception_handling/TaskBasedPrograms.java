package exception_handling;
import java.math.*;
public class TaskBasedPrograms {
	
	public static void main(String[] args) {
//		int a  = 35;
//		System.out.println(factorial(a));
//		System.out.println(Integer.MAX_VALUE);
		
		BigInteger b1 = new BigInteger("100");
		BigInteger b2 = new BigInteger("100");
		
		System.out.println(b1.add(b2));
		System.out.println(b1.subtract(b2));
		System.out.println(b1.multiply(b2));
		System.out.println(b1.divide(b2));
		System.out.println(b1.mod(b2));
		System.out.println(b1.remainder(b2));
		
		
	}

}


