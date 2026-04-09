
package deliverysystem;
public class Truck extends DeliveryVehicle{
    private double fuel;

    public Truck(String riderName ,double speed,double fuel) 
    {
        super(riderName,speed);
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
   public double getDeliveryTime(Customer c2){
       if(fuel<1)
       {
           return 99999;
       }
       else
       {
           return c2.getDistance()/getSpeed();
       }
   }
}
