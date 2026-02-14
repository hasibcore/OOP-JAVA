
package employeemanagement;
import java.util.Scanner;

public class EmployeeManagement {

    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       System.out.print("Enter the number of employees: ");
       int size=sc.nextInt();
       Employee[] employee=new Employee[size];
       for(int i=0;i<employee.length;i++)
       {
           employee[i]=new Employee();
            sc.nextLine();
           System.out.print("\n Name: ");
           String Name=sc.nextLine();
           employee[i].setName(Name);
           
           System.out.print("\nID : ");
           int id=sc.nextInt();
           
           employee[i].setId(id);
           System.out.print("\nSalary : ");
           double salary=sc.nextDouble();
          
           employee[i].setSalary(salary);
           
       }
       System.out.print("Enter a salary threshold: ");
               double exSalary=sc.nextDouble();
               EmployeeManager Manager=new EmployeeManager();
            int[] arr=Manager.filterEmployeeBySalary(employee,exSalary);
            System.out.print("\nEmployees with salary higher than "+exSalary+"\n");
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]!=0)
                {
                  System.out.println(arr[i]);  
                }
                
            }
    }
    
}
