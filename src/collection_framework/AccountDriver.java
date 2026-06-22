package collection_framework;

public class AccountDriver {
	public static void main(String[] args) {
		Account a = new Account("123ABC", "Rangaraj", 70000.10);
		
		a.withdraw(40000);
		a.withdraw(40000);
		a.withdraw(40000);
	}
}
