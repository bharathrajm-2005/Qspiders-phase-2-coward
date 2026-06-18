package exception_handling;

public class StudentCRUD {
	
	Student[]students = new Student[5];
	int i;
	public void addStudent(Student student) {
		if(i<5) {
			students[i++]=student;
		}
		else {
			System.out.println("No space");
		}
	}
	
	public Student getStudent(int id) {
		for(Student student:students) {
			if(student!=null && student.getId()==id) {
				return student;
			}
		}
		
		throw new StudentNotFoundException("The Student with id "+id+" is not found");
	}
	
}
