package collection_framework;

public class Account {
	private String accountNumber;
	private String name;
	private double balance;
	public Account(String accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getbalance() {
		return balance;
	}
	public void setbalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", Balance=" + balance + "]";
	}
	
	public void withdraw(double balance) {
		if(this.balance>=balance){
			this.balance-=balance;
			System.out.print("Money withdrawn , Balance : ");
			System.out.printf("%.2f",this.balance);
			System.out.println();
			
		}else{
			throw new InsufficientBalanceException("The amount is insufficient for withdrawal");
		}
	}
	
}
