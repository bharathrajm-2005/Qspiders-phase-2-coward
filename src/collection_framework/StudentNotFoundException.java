package collection_framework;

@SuppressWarnings("serial")
public class StudentNotFoundException extends RuntimeException {
	
	public StudentNotFoundException(String message) {
		super(message);
	}
}
