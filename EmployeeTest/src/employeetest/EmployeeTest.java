
package employeetest;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
               System.out.println("Total Projects : ");
               int project=sc.nextInt();
               System.out.println("Total Months : ");
               int month=sc.nextInt();
               Developer d1=new Developer(project,month);
               HROfficer officer=new HROfficer();
               officer.checkPerformance(d1);
    }
    
}
