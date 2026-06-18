package comparable_comparators;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class RamComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Laptop l1 = (Laptop)o1;
		Laptop l2 = (Laptop)o2;
		if(l1.getRam()==l2.getRam()){
			return (int)(l1.getPrice()-l2.getPrice());
		}
		return l1.getRam()-l2.getRam();
	}
}
