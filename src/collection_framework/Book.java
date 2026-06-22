package collection_framework;

import java.util.Objects;

public class Book {
	private int id;
	private String name;
	private double price;
	private String yearOfPublish;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getYearOfPublish() {
		return yearOfPublish;
	}
	public void setYearOfPublish(String yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}
	public Book(int id, String name, double price, String yearOfPublish) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.yearOfPublish = yearOfPublish;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, price, yearOfPublish);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(yearOfPublish, other.yearOfPublish);
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", yearOfPublish=" + yearOfPublish + "]";
	}
	
}
