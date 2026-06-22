package collection_framework;
import java.util.*;
public class RemoveStudentBasedOnAttribute {
	
	public static void main(String[] args) {
		List<Student>students = new ArrayList<Student>();
		students.add(new Student(101, "Bala", 90));
		students.add(new Student(102, "Bala P", 90));
		students.add(new Student(103, "Bala", 90));
		students.add(new Student(104, "Bala Pra", 90));
		students.add(new Student(105, "Bala Pram", 90));
		students.add(new Student(106, "Bala Prami", 90));
		List<Student>filter = new ArrayList<Student>();
		for(Student s : students) {
			if(s.getName().equals("Bala")) {
				filter.add(s);
			}
		}
		
		students.removeAll(filter);
		for(Student s : students) {
			System.out.println(s);
		}

	}
	
}
