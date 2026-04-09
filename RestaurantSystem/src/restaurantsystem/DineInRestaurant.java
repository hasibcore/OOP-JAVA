
package restaurantsystem;

public class DineInRestaurant extends Restaurant{
    private int kitchenCapacity;

    public DineInRestaurant(int kitchenCapacity, String name, double waitTime) {
        super(name, waitTime);
        this.kitchenCapacity = kitchenCapacity;
    }
    @Override
   public double getPreparationTime(Item i)
    {
        if(kitchenCapacity<i.getPrice())
        {
            return Integer.MAX_VALUE;
        }
        else{
            return getWaitTime() + (i.getPrice() / 2);
      }
   }
}