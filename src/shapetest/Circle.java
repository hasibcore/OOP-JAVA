
package shapetest;


public class Circle extends Shape{
    private double radius;

    public Circle() {
        super();
    }

    
     public Circle(String colour, boolean filled) {
        super(colour, filled);
    }
public Circle(String colour, boolean filled,double radius) {
        super(colour, filled);
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
void displayShape()
{
    System.out.println("The Colour of Circle : "+getColour());
    System.out.println("Is that ? "+" Ans:  "+isFilled());
    System.out.println("The Radius of Circle : "+getRadius());
}
    
     
}
