package employeetest;

public class HROfficer {
    private int cutoff;

    public HROfficer() {
        this.cutoff=150;
    }

    public int getCutoff() {
        return cutoff;
    }

    public void setCutoff(int cutoff) {
        this.cutoff = cutoff;
    }
    
    void checkPerformance(Developer d)
    {
        int performance=(d.getTotalProjects()+10*d.getTotalmonths());
        System.out.println("The Performance : "+performance);
        if(performance>=getCutoff())
        {
            System.out.println("Employee Promoted ");
        }
        else {
            System.out.println("Employee not Promoted ");
        }
    }
}
