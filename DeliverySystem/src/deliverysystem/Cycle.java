
package deliverysystem;
public class Cycle extends DeliveryVehicle {
    private  double distanceThreshold;

    public Cycle(double distanceThreshold, String riderName, double speed) {
        super(riderName, speed);
        this.distanceThreshold = distanceThreshold;
    }

    
    public double getDistanceThreshold() {
        return distanceThreshold;
    }

    public void setDistanceThreshold(double distanceThreshold) {
        this.distanceThreshold = distanceThreshold;
    }
    @Override
    public double getDeliveryTime(Customer c1)
    {
        if(c1.getDistance()>distanceThreshold) 
        {
            return 99999;
        }
        else{
            return c1.getDistance()/getSpeed();
        }
    }
}
