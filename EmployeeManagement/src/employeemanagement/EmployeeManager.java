
package employeemanagement;

public class EmployeeManager {
    public static int[] filterEmployeeBySalary(Employee[] employee,double salary )
    {
        int count=0;
        int[] array=new int[employee.length];
        for(int i=0;i<employee.length;i++)
        {
            if(employee[i].getSalary()>salary)
            {
                array[count]=employee[i].getId();
                count++;
            }
        }
        return array;
    }

}
