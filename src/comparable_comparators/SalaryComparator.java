package comparable_comparators;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class SalaryComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		
		return (int)(e2.getSalary()-e1.getSalary());
	}

}
