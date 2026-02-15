
package salarydemo;

import java.util.Scanner;

public class SalaryDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Designation : ");
        String designation=sc.nextLine();
        System.out.println("Hours Worked : ");
        int hoursWorked=sc.nextInt();
        Worker w1=new Worker(designation,hoursWorked);
        SalaryCalculator s1=new SalaryCalculator();
        System.out.println("Salary is "+ s1.calculateSalary(w1));
    }
    
}
