package restaurantsystem;

import java.util.ArrayList;

public class OrderManagement {
   private ArrayList<Restaurant>availableRestaurant=new ArrayList<>(); 

    public ArrayList<Restaurant> getAvailableRestaurant() {
        return availableRestaurant;
    }

    public void setAvailableRestaurant(ArrayList<Restaurant> availableRestaurant) {
        this.availableRestaurant = availableRestaurant;
    }

    
  public void addRestaurant(Restaurant r)
   {
     availableRestaurant.add(r);
       System.out.println(r.getName()+" was added.");
   }
  public Restaurant getFastestRestaurant(Item it)
  {
      double low=availableRestaurant.get(0).getPreparationTime(it);
      int index=0;
       for(int i=1;i<availableRestaurant.size();i++)
       {
           
           if(low>availableRestaurant.get(i).getPreparationTime(it))
           {
               low=availableRestaurant.get(i).getPreparationTime(it);
               index=i;
           }
       }
      availableRestaurant.remove(it);
      return availableRestaurant.get(index);
  }
}
