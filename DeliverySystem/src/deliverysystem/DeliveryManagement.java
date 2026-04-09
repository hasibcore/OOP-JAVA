
package deliverysystem;

import java.util.ArrayList;

public class DeliveryManagement {
    ArrayList<DeliveryVehicle> arr=new ArrayList<>();
    void addvehicle(DeliveryVehicle dv)
    {
        arr.add(dv);
        System.out.println(dv.getRiderName()+" was added.");
    }
    DeliveryVehicle getBestVehicle(Customer c3)
    {
        double minDeliveryTime=arr.get(0).getDeliveryTime(c3);
        int index=0;
        for(int i=1;i<arr.size();i++)
        {
            double time=arr.get(i).getDeliveryTime(c3);
          if(time<minDeliveryTime) 
          {
             minDeliveryTime=time;
             index=i;
          }   
        }
       DeliveryVehicle best= arr.get(index);
          arr.remove(best);
          return best; 
    }
}
