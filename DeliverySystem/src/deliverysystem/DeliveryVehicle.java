package deliverysystem;
public abstract class DeliveryVehicle {
    private String riderName;
    private double speed;

    public DeliveryVehicle(String riderName, double speed) {
        this.riderName = riderName;
        this.speed = speed;
    }

    public String getRiderName() {
        return riderName;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
  public abstract double getDeliveryTime(Customer c);
    
    
}