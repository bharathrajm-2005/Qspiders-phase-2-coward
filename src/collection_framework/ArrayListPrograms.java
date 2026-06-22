package collection_framework;

import java.util.*;

public class ArrayListPrograms {
public static void main(String[] args) {
	ArrayList<Student>str1 = new ArrayList<Student>();
	
	str1.add(new Student(101, "Bharath", 80));
	str1.add(new Student(101, "Akash", 80));
	str1.add(new Student(101, "Anton", 90));
	str1.add(new Student(101, "Chriswin kumar", 80));
	str1.add(new Student(101, "Bala moses", 80));
	
	Iterator<Student> it = str1.iterator();
	while(it.hasNext()) {
		System.out.println(it.next()); 
	}
	
}
}

