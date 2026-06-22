package comparable_comparators;

import java.util.*;

public class LaptopDriver {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Laptop[]laptops = new Laptop[10];
	laptops[0] = new Laptop(101, "Dell", 16, 75000.00);
	laptops[1] = new Laptop(102, "Asus", 8, 62000.00);
	laptops[2] = new Laptop(103, "Lenovo", 32, 120000.00);
	laptops[3] = new Laptop(104, "Apple", 16, 145000.00);
	laptops[4] = new Laptop(105, "HP", 4, 35000.00);
	laptops[5] = new Laptop(106, "Acer", 12, 58000.00);
	laptops[6] = new Laptop(107, "MSI", 24, 98000.00);
	laptops[7] = new Laptop(108, "Samsung", 8, 68000.00);
	laptops[8] = new Laptop(109, "Dell", 32, 110000.00);
	laptops[9] = new Laptop(110, "Asus", 16, 72000.00);
	
//	Arrays.sort(laptops);
	
	
	System.out.println("Enter on what category need to sort");
	String category = sc.next();
	
	if(category.equalsIgnoreCase("Ram")) {
		Arrays.sort(laptops , new RamComparator());
	}
	
	else if(category.equalsIgnoreCase("Price")) {
		Arrays.sort(laptops , new PriceComparator());
	}
	else if(category.equalsIgnoreCase("Brand")) {
		Arrays.sort(laptops , new BrandComparator());
	}
	else {
		System.out.println("Enter valid input");
	}
	
	for(Laptop  l : laptops) {
		System.out.println(l);
	}
	sc.close();
}
}
