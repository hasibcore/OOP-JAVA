package com.mycompany.cardemo;
public class Car {
   private String owner;
   private int monthUsed;
   private double buyingPrice;
   
   public Car()
   {
       
   }
   public Car(String owner,int monthUsed,double buyingPrice)
   {
       this.owner=owner;
       this.monthUsed=monthUsed;
       this.buyingPrice=buyingPrice;
   }
 public  void setOwner(String owner)
   {
       this.owner=owner;
   }
  public void setMonthUsed(int monthUsed)
   {
       this.monthUsed=monthUsed;
   }
   public void setBuyingPrice(double buyingPrice)
   {
       this.buyingPrice=buyingPrice;
   }
   
   public String getOwner()
   {
      return owner;
   }
  public int getMonthUsed()
   {
       return monthUsed;
   }
   public double getBuyingPrice()
   {
       return buyingPrice;
   }
   
}
