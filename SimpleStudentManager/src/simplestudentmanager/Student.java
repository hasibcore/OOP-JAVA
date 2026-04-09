
package simplestudentmanager;

public class Student {
    private String name;
    private int id;
    private double CGPA;

    public Student(String name, int id, double CGPA) {
        this.name = name;
        this.id = id;
        this.CGPA = CGPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
    public void printDetails()
    {
        System.out.println("Id : "+id+" "+"CGPA : "+CGPA);
    }
}
