package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSorting {
public static void main(String[] args) {
	List<Student>students = new ArrayList<Student>();
	students.add(new Student(101, "Bala", 90));
	students.add(new Student(102, "Bala P", 90));
	students.add(new Student(103, "Bala", 90));
	students.add(new Student(104, "Bala Pra", 90));
	students.add(new Student(105, "Bala Pram", 90));
	students.add(new Student(106, "Bala Prami", 90));
	
	Collections.sort(students);
	
}
}
