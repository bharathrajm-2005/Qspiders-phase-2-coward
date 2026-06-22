package comparable_comparators;

public class Laptop implements Comparable<Laptop> {
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
	public int compareTo(Laptop o) {
		return this.ram-o.ram;

	}
	
}
