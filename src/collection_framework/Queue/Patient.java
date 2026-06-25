package collection_framework.Queue;

public class Patient implements Comparable<Patient> {
	private int patientId;
	private String patientName;
	private int priority;
	private int addmissionNumber;
	public Patient(int patientId, String patientName, int priority, int addmissionNumber) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.priority = priority;
		this.addmissionNumber = addmissionNumber;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getAddmissionNumber() {
		return addmissionNumber;
	}
	public void setAddmissionNumber(int addmissionNumber) {
		this.addmissionNumber = addmissionNumber;
	}
	@Override
	public String toString() {
		return "Hospital [patientId=" + patientId + ", patientName=" + patientName + ", priority="
				+ priority + ", addmissionNumber=" + addmissionNumber + "]";
	}
	@Override
	public int compareTo(Patient o) {
		if(this.getPriority()==o.getPriority())
			return this.getAddmissionNumber()-o.getAddmissionNumber();
		return this.getPriority()-o.getPriority();
		
	}
	
	
}
