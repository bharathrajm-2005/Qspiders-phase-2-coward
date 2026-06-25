package collection_framework;

@SuppressWarnings("serial")
public class UserNotFoundException extends RuntimeException{
	
	public UserNotFoundException(String message) {
		super(message);
	}

}
