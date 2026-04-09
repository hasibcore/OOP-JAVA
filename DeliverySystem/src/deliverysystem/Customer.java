
package deliverysystem;


public class Customer {
    private String Name;
    private double Distance;
   public Customer(){
       
   }

    public Customer(String Name, double Distance) {
        this.Name = Name;
        this.Distance = Distance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getDistance() {
        return Distance;
    }

    public void setDistance(double Distance) {
        this.Distance = Distance;
    }
   
}
