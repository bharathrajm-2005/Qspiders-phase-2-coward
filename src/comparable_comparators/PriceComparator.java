package comparable_comparators;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class PriceComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Laptop l1 = (Laptop)o1;
		Laptop l2 = (Laptop)o2;
		
		return (int)(l2.getPrice()-l1.getPrice());
	}
}
