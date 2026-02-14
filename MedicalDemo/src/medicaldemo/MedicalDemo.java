
package medicaldemo;

import java.util.Scanner;

public class MedicalDemo {

    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
        System.out.println("Enter Patient's Name : ");
        String name=sc.nextLine();
        System.out.println("Enter Body Temparature : ");
        double bodyTemp=sc.nextDouble();
        System.out.println("Enter Duration : ");
        int duration=sc.nextInt();
        Patient p1=new Patient(name,bodyTemp,duration);
        System.out.println("Result: "+p1.diafnosePatient());
        display(p1); // Must Be Static Because a non Static Method can't be called in Static Method 
    }
   
     static void display(Patient p)
     {
           System.out.println("Result : "+p.diafnosePatient());
      }
}
