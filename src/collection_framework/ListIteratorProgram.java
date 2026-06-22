package collection_framework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorProgram {
public static void main(String[] args        ) {
ArrayList<Student>str1 = new ArrayList<Student>();
	
	str1.add(new Student(101, "Bharath", 80));
	str1.add(new Student(101, "Akash", 80));
	str1.add(new Student(101, "Anton", 90));
	str1.add(new Student(101, "Chriswin kumar", 80));
	str1.add(new Student(101, "Bala moses", 80));
	
	ListIterator<Student> it = str1.listIterator();
	while(it.hasNext()) { 
		System.out.println(it.next()); 
	}
	System.out.println();
	while(it.hasPrevious()) {
		System.out.println(it.previous()); 
	}
	for(Student a : str1) {
		System.out.println(a);
	}
	
}
}
