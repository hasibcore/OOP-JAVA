package restaurantsystem;

public class RestaurantSystem {
    public static void main(String[] args) {
      Item i1=new Item("Pasta", 15.50);
        Item i2=new Item("pizza", 20);
        //Restaurant res;
        Restaurant dr1=new DineInRestaurant(10, "Rooster", 10);
       Restaurant dr2=new DineInRestaurant(0, "Chillox", 25);
       Restaurant tr1=new TakeoutRestaurant(5,"Alfresco" , 25);
  
       OrderManagement OM=new OrderManagement();
       OM.addRestaurant(dr1);
       OM.addRestaurant(dr2);
       OM.addRestaurant(tr1);
     Restaurant best1= OM.getFastestRestaurant(i1);
     Restaurant best2= OM.getFastestRestaurant(i2);
        System.out.println(best1.getName()+" is the fastest to prepare "+i1.getName());
        System.out.println(best2.getName()+" is the fastest to prepare "+i2.getName());

    }
    
}
