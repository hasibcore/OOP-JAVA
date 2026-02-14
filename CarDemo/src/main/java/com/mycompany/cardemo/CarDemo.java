package com.mycompany.cardemo;
import java.util.Scanner;
public class CarDemo {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Owner Name: ");
        String name=sc.nextLine();
       System.out.println("Enter Months Used: ");
       int m=sc.nextInt();
       System.out.println("Enter Buying Price : ");
       double price=sc.nextDouble();
      Car oldCar=new Car(name,m,price);
       Seller seller = new Seller();
       //oldCar.setOwner(name);
   //oldCar.setMonthUsed(m);
   //oldCar.setBuyingPrice(price);
   double resale=seller.calculateResalePrice(oldCar);
   System.out.println("Resale Value: "+resale);
    }
}
