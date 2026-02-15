
package salarydemo;


public class SalaryCalculator {

    public SalaryCalculator() {
    }
    public double calculateSalary(Worker w )
    {
       if(w.getDesignation().equals("Salesman"))
       {
           return (w.getHoursWorked()*100);
       }
       else if(w.getDesignation().equals("Manager"))
       {
           return (w.getHoursWorked()*110);
       }
       else {
           return (w.getHoursWorked()*60);
       }
    }

   
}
