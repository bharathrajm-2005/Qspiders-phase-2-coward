package collection_framework;
import java.util.*;
public class UserDriver {
	public static void main(String[] args) {
		List<User>users = new ArrayList<>();
		
		users.add(new User(101, "Adil Raj", "adil.raj@gmail.com", "Adil@123", 24, "Male"));
		users.add(new User(102, "Bharath of Bethlehem", "bharath.bethlehem@gmail.com", "Bharath@456", 20, "Male"));
		users.add(new User(103, "Chriswin Kumar", "chriswin.kumar@yahoo.com", "Chriswin@789", 27, "Male"));
		users.add(new User(104, "Dev Ahamed", "dev.ahamed@outlook.com", "DevAhamed@321", 2, "Male"));
		users.add(new User(105, "Eshwar Singh", "eshwar.singh@gmail.com", "Eshwar@654", 29, "Male"));
		
		System.out.println(searchEmail(users, "adil.raj@gmail.com"));
		System.out.println(searchGender(users, "Male"));
		System.out.println(searchAge(users, 20));
		
		
	}
	
	public static User searchEmail(List<User> users ,String email) {
		for(User u : users) {
			if(u.getEmail().equals(email)) {
				return u;
			}
		}
		throw new UserNotFoundException("The email :"+email+" was not found");
	}
	public static List<User> searchGender(List<User> users ,String gender) {
		List<User>ageGender = new ArrayList<>();
		for(User u : users) {
			if(u.getGender().equals(gender)) {
				ageGender.add(u);
			}
		}
		if(ageGender.size()>0)
			return ageGender;
		throw new UserNotFoundException("The gender :"+gender+" was not found");
	}
	public static List<User> searchAge(List<User> users ,int age) {
		List<User>ageUsers = new ArrayList<>();
		for(User u : users) {
			if(u.getAge()==age) {
				ageUsers.add(u);
			}
		}
		if(ageUsers.size()>0)
			return ageUsers;
		throw new UserNotFoundException("The age :"+age+" was not found");
	}
}
