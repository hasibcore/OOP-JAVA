package com.mycompany.movieticket;
import java.util.Scanner;
public class MovieTicket {
    public static void main(String[] args) {
       // System.out.println("Hello World!");
Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Name : ");
        String name=sc.nextLine();
        System.out.println("Enter age : ");
        int age=sc.nextInt();
        System.out.println("Is Student : ");
        boolean b=sc.nextBoolean();
        System.out.println("Base Ticket Price : ");
        int price=sc.nextInt();
        Customer c1 = new Customer(name,age,b);
       double total_price =c1.CalculatedTicketPrice(price);
       System.out.println(name+"'s ticket Price : "+total_price);

    }
}

