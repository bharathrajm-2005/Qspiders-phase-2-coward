package comparable_comparators;

import java.util.Comparator;

public class BrandComparator implements Comparator<Laptop>{
	
//	public <T>BrandComparator(T o) {
//		System.out.println(o);
//	}
	
	public static<T>void leo(T o){
		System.out.println(o);
	}
	@Override
	public int compare(Laptop l1, Laptop l2) {
		
		return l1.getBrand().compareTo(l2.getBrand());
	}

}
