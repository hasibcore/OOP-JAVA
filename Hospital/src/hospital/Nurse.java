package hospital;

public class Nurse extends HospitalEmployee implements Salariable {
    private int hoursWorked;

    // Constructor
    public Nurse(String id, String name, String dept, int hoursWorked) {
        super(id, name, dept);
        this.hoursWorked = hoursWorked;
    }

    // Getter & Setter
    public int getHoursWorked() { return hoursWorked; }
    public void setHoursWorked(int hours) { this.hoursWorked = hours; }

    // Method
    @Override
    public double calculateSalary() {
        return hoursWorked * 20;
    }
}
