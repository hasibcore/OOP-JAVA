
package university;
import java.util.Scanner;
public class University {

    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
        Student[] st=new Student[3];  
    for(int i=0;i<st.length;i++)
    {
         System.out.println("Enter name of student " + (i + 1) + ":");
         String name=sc.nextLine();
         double[] marks=new double[3]; 
         for(int j=0;j<marks.length;j++)
         {
             System.out.print("\n Enter marks of sub "+(j+1)+" : ");
             
             marks[j]=sc.nextDouble();
         }
            sc.nextLine();
            st[i]=new Student(name,marks);
    }
    for(int i=0;i<st.length;i++)
    {
        st[i].showInfo();
         System.out.println();
    }
}
}