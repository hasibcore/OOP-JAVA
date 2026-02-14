
package testtrain;


public class Train {
    private double ticketPrice,distance;
    private String destination;

    public Train() 
    {
    }

    public Train(double ticketPrice, double distance, String destination) {
        this.ticketPrice = ticketPrice;
        this.distance = distance;
        this.destination = destination;
    }
    
  

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    
     public double getDiscount()
     {
         if(getDistance()>=6000)
         {
             return (getTicketPrice()-getTicketPrice()*0.25);
         }
         else{
        return getTicketPrice();
         }
     }
}
