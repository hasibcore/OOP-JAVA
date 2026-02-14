
package com.mycompany.cardemo;


public class Seller {
   public double calculateResalePrice(Car oldCar)
    {
       double resalePrice=(oldCar.getBuyingPrice()-(10000*oldCar.getMonthUsed()));
    return resalePrice; 
    }
  
}
