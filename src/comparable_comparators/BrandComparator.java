package comparable_comparators;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class BrandComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Laptop l1 = (Laptop)o1;
		Laptop l2 = (Laptop)o2;
		
		return l1.getBrand().compareTo(l2.getBrand());
	}

}
