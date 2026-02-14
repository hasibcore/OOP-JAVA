
package testtrain;

import java.util.Scanner;
public class TestTrain {

   
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter Destination : ");
        String place=sc.nextLine();
        System.out.println("Regular Ticket Price : ");
        double price=sc.nextDouble();
        System.out.println("Enter Distance : ");
        double distance=sc.nextDouble();
     Train t1=new Train(price,distance,place);
  double finalPrice=t1.getDiscount();

        System.out.println("Final price : "+finalPrice);
    }
    
}
