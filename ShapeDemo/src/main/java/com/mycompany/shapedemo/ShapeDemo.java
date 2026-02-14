

package com.mycompany.shapedemo;
import java.util.Scanner;
public class ShapeDemo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("Enter length : ");
     double length=sc.nextDouble() ;  
        System.out.println("Enter width : ");
        double width=sc.nextDouble();
        Rectangle rec=new Rectangle(length,width);
        AreaCalculated areaC=new AreaCalculated();
        double area=areaC.calculatedArea(rec);
        System.out.println("Area : "+area);
    }
}
