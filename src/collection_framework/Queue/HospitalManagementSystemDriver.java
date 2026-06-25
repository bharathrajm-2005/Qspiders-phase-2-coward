package collection_framework.Queue;

import java.util.PriorityQueue;

public class HospitalManagementSystemDriver {
	
	static PriorityQueue<Patient> patients = new PriorityQueue<>();
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		addPatient(new Patient(101, "Arun Kumar", 1, 1001));
		addPatient(new Patient(102, "Priya Sharma", 2, 1002));
		addPatient(new Patient(103, "Rahul Verma", 3, 1003));
		addPatient(new Patient(104, "Sneha Reddy", 1, 1004));
		addPatient(new Patient(105, "Karthik Raj", 2, 1005));
		addPatient(new Patient(106, "Anjali Gupta", 3, 1006));
		addPatient(new Patient(107, "Vikram Singh", 1, 1007));
		addPatient(new Patient(108, "Meera Nair", 2, 1008));
		
		displayWaitingPatients();
		
		Patient p = treatNextPatient();
		Patient p1 = treatNextPatient();
		Patient p2 = treatNextPatient();
		Patient p3 = treatNextPatient();
		System.out.println("------------------------");
		displayWaitingPatients();
		
	}
	
	public static void addPatient(Patient h) {
		patients.add(h);
	}
	
	public static Patient treatNextPatient() {	
		return patients.poll();	
	}
	public static Patient getNextPatient() {	
		return patients.peek();	
	}
	public static void displayWaitingPatients() {
		for(Patient h : patients) {
			System.out.println(h);
		}
	}
}
