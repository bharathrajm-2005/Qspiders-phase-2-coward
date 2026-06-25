package collection_framework;
import java.util.*;
public class SearchStudentAttributeBased {
	static List<Student>students = new ArrayList<Student>();
	public static void main(String[] args) {
	
		students.add(new Student(101, "Bala", 90));
		students.add(new Student(102, "Bala P", 90));
		students.add(new Student(103, "Bala", 90));
		students.add(new Student(104, "Bala Pra", 90));
		students.add(new Student(105, "Bala Pram", 90));
		students.add(new Student(106, "Bala Prami", 90));
	
		System.out.println(searchStudent(100));
		students.remove(new Student(105, "Bala Pram", 90));
		System.out.println(students.size());

	}
	public static Student searchStudent(int id) {
		for(Student s : students) {
			if(s.getId()==id){
				return s;
			}
		}
	
		throw new StudentNotFoundException("The student with id :"+id+"Not found");
	}
}
