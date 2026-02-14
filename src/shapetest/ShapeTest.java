
package shapetest;
import java.util.Scanner;
public class ShapeTest {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
        System.out.println("Enter color :");
        String colour=sc.nextLine();
        System.out.println("Enter boolean value :");
        boolean isfilled=sc.nextBoolean();
        System.out.println("Enter radius : ");
        double radius=sc.nextDouble();
        System.out.println("Enter Width :");
        double width=sc.nextDouble();
        System.out.println("Enter length");
        double length=sc.nextDouble();
  Circle c1=new Circle(colour,isfilled);
  Circle c2=new Circle(colour,isfilled,radius);
  Shape s1=new Shape(colour,isfilled);
  Rectangle r1=new Rectangle(length,width);
  Rectangle r2=new Rectangle(length,width,colour,isfilled);
  c1.displayShape();
  c2.displayShape();
  s1.displayShape();
  r1.displayShape();
  r2.displayShape();
    }
    
}
