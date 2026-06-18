package comparable_comparators;

@SuppressWarnings("rawtypes")
public class Laptop implements Comparable {
	private int id;
	private String brand;
	private int ram;
	private double price;
	public Laptop(int id, String brand, int ram, double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Object o) {
		Laptop l = (Laptop)o;
		return this.ram-l.ram;

	}
	
}
