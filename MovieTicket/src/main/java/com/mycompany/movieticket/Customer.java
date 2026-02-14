package com.mycompany.movieticket;
public class Customer {
    public String CustomerName;
    public int age;
   public  boolean isStudent;
     public Customer()
     {
         
     }
     
     public Customer(String CustomerName,int age,boolean isStudent)
     {
         this.CustomerName=CustomerName;
         this.age=age;
         this.isStudent=isStudent;
     }
     public double CalculatedTicketPrice(double price)
     {
         if(age<=12 && isStudent==true)
         {
             return (price*0.8);
         }
         if(age>12 && isStudent==true)
         {
             return (price*1.10);
         }
         else
         {
             return ( price+price*1.15);
         }
     }
     /* public void print(String name,int price)
     {
         Sytem.out.print("name"+);
         
         
     }*/
}