
package structuretest;

import java.util.Scanner;

public class StructureTest {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Input Radius : ");
        double radius1=sc.nextDouble();
        System.out.println("Input radius and height");
        double radius2=sc.nextDouble();
        double height1=sc.nextDouble();
        System.out.println("Input base,height and length : ");
        double base1=sc.nextDouble();
        double height2=sc.nextDouble();
        double length1=sc.nextDouble();
        DevelopStructure ds1=new DevelopStructure();
        DevelopStructure ds2=new DevelopStructure();
        DevelopStructure ds3=new DevelopStructure();
       Structure s1= ds1.produceStructure(radius1);
        Structure s2= ds2.produceStructure(radius2,height1);
       Structure s3=  ds3.produceStructure(base1,height2,length1);
        System.out.println("Volume of Structure 1 :"+s1.getStructureVolume());
        System.out.println("Volume of Structure 2 :"+s2.getStructureVolume());
        System.out.println("Volume of Structure 3 :"+s3.getStructureVolume());
    }
    
}
