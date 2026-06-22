package comparable_comparators;

import java.util.Comparator;

public class PriceComparator implements Comparator<Laptop> {
	@Override
	public int compare(Laptop l1, Laptop l2) {
		
		return (int)(l2.getPrice()-l1.getPrice());
	}
}
