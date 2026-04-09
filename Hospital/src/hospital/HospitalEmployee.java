package hospital;

public abstract class HospitalEmployee {
    private String id;
    private String name;
    private String dept;

    // Constructor
    public HospitalEmployee(String id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    // Getter & Setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDept() { return dept; }
    public void setDept(String dept) { this.dept = dept; }

    // Other method
    public String getDetails() {
        return "ID: " + id + ", Name: " + name + ", Dept: " + dept;
    }

    // Abstract method
    public abstract double calculateSalary();
}