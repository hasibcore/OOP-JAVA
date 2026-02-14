
package shapetest;

public class Shape {
    private String colour;
    private boolean filled;

    public Shape() {
        colour="White";
        filled=true;
    }

    public Shape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColour() {
        return colour;
    }

    public boolean isFilled() {
        return filled;
    }
    void displayShape()
    {
        System.out.println("The Colour of Shape"+getColour());
        System.out.println("Is that ? "+" Ans:  "+isFilled());
    }
}
