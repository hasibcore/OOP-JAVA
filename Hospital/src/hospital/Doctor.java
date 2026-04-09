package hospital;

public class Doctor extends HospitalEmployee implements Salariable {
    private int patientCount;

    // Constructor
    public Doctor(String id, String name, String dept, int patientCount) {
        super(id, name, dept);
        this.patientCount = patientCount;
    }

    // Getter & Setter
    public int getPatientCount() { return patientCount; }
    public void setPatientCount(int count) { this.patientCount = count; }

    // Method
    @Override
    public double calculateSalary() {
        return patientCount * 50;
    }
}