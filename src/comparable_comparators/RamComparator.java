package comparable_comparators;

import java.util.Comparator;

public class RamComparator implements Comparator<Laptop> {
	@Override
	public int compare(Laptop l1, Laptop l2) {
		if(l1.getRam()==l2.getRam()){
			return (int)(l1.getPrice()-l2.getPrice());
		}
		return l1.getRam()-l2.getRam();
	}
}
