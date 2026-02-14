                                                                                                                                              
package createtulip;

import java.util.Scanner;
public class CreateTulip {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  Tulip redTulip=new Tulip("Red",2);
  Tulip whiteTulip=new Tulip("White",5);
  System.out.println("Properties of 1st Tulip Oobj");
  System.out.println("Red Tulip's Color :"+redTulip.getColor()+"\nWhite Tulip's Color :"+whiteTulip.getColor());
  System.out.println("Red Tulip's height :"+redTulip.getHeight()+"\nWhite Tulip's height :"+whiteTulip.getHeight());
  Tulip com=redTulip.mixedTulip(whiteTulip);
   System.out.println("After " +com.getHeight());
      System.out.println("After " +com.getColor());     
           
    }
    
}
