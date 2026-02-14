
package com.mycompany.shapedemo;


public class Rectangle {
    private double length;
    private double width;
    public Rectangle(double length,double width)
    {
     this.length=length;
     this.width=width;
    
    }
   public void setlength(double length)
    {
        this.length=length;
        
    }
  public   void width(double width)
    {
        this.width=width;
    }
     public double getlength()
    {
        return length;
        
    }
  public double getwidth()
    {
        return width;
    }
}
