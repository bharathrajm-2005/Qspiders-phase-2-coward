package collection_framework;

import java.util.Objects;

public class User {
	private int id;
	private String name;
	private String email;
	private String password;
	private int age;
	private String gender;
	
	public User(int id, String name, String email, String password, int age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.age = age;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", age=" + age
				+ ", gender=" + gender + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, email, gender, id, name, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && Objects.equals(email, other.email) && Objects.equals(gender, other.gender)
				&& id == other.id && Objects.equals(name, other.name) && Objects.equals(password, other.password);
	}
	
	
}
