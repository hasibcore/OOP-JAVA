
package employeetest;


public class Developer {
    private int totalProjects,totalmonths;

    public Developer() {
    }

    public Developer(int totalProjects, int totalmonths) {
        this.totalProjects = totalProjects;
        this.totalmonths = totalmonths;
    }

    public int getTotalProjects() {
        return totalProjects;
    }

    public void setTotalProjects(int totalProjects) {
        this.totalProjects = totalProjects;
    }

    public int getTotalmonths() {
        return totalmonths;
    }

    public void setTotalmonths(int totalmonths) {
        this.totalmonths = totalmonths;
    }
    
}
