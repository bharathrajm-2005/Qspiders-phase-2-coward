package comparable_comparators;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		if(e1.getName().equals(e2.getName())){
			return (int)(e2.getSalary()-e1.getSalary());
		}
		return e1.getName().compareTo(e2.getName());
//		return 0;
	}

}
