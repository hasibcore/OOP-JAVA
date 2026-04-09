
package deliverysystem;
import java.util.ArrayList;

public class DeliverySystem {

    public static void main(String[] args) {
      Customer c1=new Customer("Rafiq",50);
      Customer c2=new Customer("Asif",70);
      DeliveryVehicle cy1=new Cycle(20, "Ashfiq", 20);
     DeliveryVehicle cy2=new Cycle(2, "Afi", 70);
     DeliveryVehicle t1=new Truck("Rafi",30,50);
     DeliveryManagement dm=new DeliveryManagement();
     dm.addvehicle(cy1);
     dm.addvehicle(cy2);
     dm.addvehicle(t1);
   DeliveryVehicle Dv=  dm.getBestVehicle(c1);
        System.out.println(Dv.getRiderName()+" delivering to "+c1.getName());
        
         DeliveryVehicle Dv2=  dm.getBestVehicle(c2);
        System.out.println(Dv2.getRiderName()+" delivering to "+c2.getName());
        
    }
    
}
