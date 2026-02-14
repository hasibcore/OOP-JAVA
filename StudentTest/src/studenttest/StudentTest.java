package studenttest;
import java.util.Scanner;
public class StudentTest {
   public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
       System.out.println("Input Voltage : ");
       double voltage1=sc.nextDouble();
       System.out.println("Input Voltage,Current : ");
       double voltage2=sc.nextDouble();
       double current=sc.nextDouble();
       System.out.println("Input Hours,Power Rating,Efficiency: ");
       int hours=sc.nextInt();
       int rate=sc.nextInt();
       double efficiency=sc.nextDouble();
       ApplianceFactory apf=new ApplianceFactory();
      Appliance ap1= apf.createdAppliance(voltage1);
       Appliance ap2=apf.createdAppliance(voltage2, current);
       Appliance ap3=apf.createdAppliance(hours, rate, efficiency);
      ap1.displayConsumption();
      ap2.displayConsumption();
      ap3.displayConsumption();
    }
    
}
