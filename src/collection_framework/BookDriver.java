package collection_framework;
import java.util.*;

public class BookDriver {
	static List<Book>books = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("How much books do you want to add :");
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Id :");
			int id = sc.nextInt();
			sc.next();
			System.out.println("Name :");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.println("Price :");
			double price = sc.nextDouble();
			System.out.println("Year of publish :");
			String yearOfPublish = sc.next();
			
			addBook(id, name, price, yearOfPublish);
		}
		
		for(Book b : books) {
			System.out.println(b);
		}
		
		sc.close();
		
		
		
	}
	
	public  static void addBook(int id, String name, double price, String yearOfPublish) {
		
		Book b = new Book(id, name, price, yearOfPublish);
		books.add(b);
		
	}
	
	
}
