
package studentmanagement;
import java.util.Scanner;
public class StudentManagement {


    public static void main(String[] args)
    {
   Scanner sc=new Scanner(System.in);
        
        Student[] StudentInfo=new Student[5];
 System.out.println("Enter details for 5 students:");
        for(int i=0;i<StudentInfo.length;i++)
        {
             StudentInfo[i] = new Student();
             
            System.out.print("\nStudent "+(i+1)+" Name: ");
            String Name=sc.nextLine();
            StudentInfo[i].setName(Name);
            System.out.print("\nStudent "+(i+1)+" ID: ");
           int Id=sc.nextInt();
            StudentInfo[i].setId(Id);
            sc.nextLine(); 
        }
         System.out.println("\nEnter the ID to search: " );
                 int id=sc.nextInt();
                 StudentManager Manager = new StudentManager();
                 Student Find= Manager.searchStudentById(StudentInfo,id);
                 if(Find==null)
                 {
                     System.out.println("Student not found. ");
                 }
                 else {
                     System.out.println("Student found: "+Find.getName());
                 }
                 
    }
    
}
