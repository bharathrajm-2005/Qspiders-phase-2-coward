package comparable_comparators;

import java.util.*;

public class Driver {
@SuppressWarnings("unchecked")
public static void main(String[] args) {
	Employee[]employees = new Employee[10];
	employees[0]=new Employee(101, "Anand Raj  ", 70000.00);
	employees[1]=new Employee(102, "Anand Raj  ", 90000.00);
	employees[2]=new Employee(103, "Anand Raj  ", 30000.00);
	employees[3]=new Employee(104, "Devesh Raj ", 43000.00);
	employees[4]=new Employee(105, "Eshwar Raj ", 74000.00);
	employees[5]=new Employee(106, "Faizel Raj ", 13000.00);
	employees[6]=new Employee(107, "Ganesh Raj ", 73000.00);
	employees[7]=new Employee(108, "Hari Raj   ", 45050.00);
	employees[8]=new Employee(109, "Inba Raj   ", 70030.00);
	employees[9]=new Employee(110, "Jagan Raj  ", 45000.00);
	
//	Arrays.sort(employees);
	
//	System.out.println(Arrays.toString(employees));
	
	Arrays.sort(employees,new NameComparator());
	for(Employee e : employees) {
		System.out.println(e);
	}
}
}