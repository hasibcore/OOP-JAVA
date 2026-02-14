
package shapetest;

public class Rectangle extends Shape {
    private double length;
    private double width;
   Rectangle()
   {
       super();
   }
    Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    Rectangle(double length,double width,String colour,boolean isFilled)
    {
        super(colour,isFilled);
        this.width=width;
        this.length=length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    void displayShape() {
        System.out.println("The Width : "+getWidth());
        System.out.println("The Length : "+getLength());
        System.out.println("Area :"+(getWidth()*getLength()));
        System.out.println("Colour : "+getColour());
        System.out.println("Is that Colour ? "+" Ans: "+isFilled());
    }
    
}
