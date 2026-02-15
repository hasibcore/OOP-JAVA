
package salarydemo;

public class Worker {
    private String designation;
    private int hoursWorked;
    public Worker() {
    }

    public Worker(String designation, int hoursWorked) {
        this.designation = designation;
        this.hoursWorked = hoursWorked;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
     
}
