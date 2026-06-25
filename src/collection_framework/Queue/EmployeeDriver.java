package collection_framework.Queue;

//import java.util.Collections;
import java.util.PriorityQueue;

public class EmployeeDriver {
	public static void main(String[] args) {
		PriorityQueue<Employee>employees = new PriorityQueue<Employee>();
		employees.offer(new Employee(101, "Bala", 70000.00));
		employees.offer(new Employee(102, "Bala", 59000.00));
		employees.offer(new Employee(103, "Bala", 98600.00));
		employees.offer(new Employee(104, "Bala", 75000.00));
		employees.offer(new Employee(105, "Bala", 30000.00));
		
		for(Employee e : employees) {
			System.out.println(e);
		}
		
	}
}
