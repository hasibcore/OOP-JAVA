
package createtulip;


public class Tulip {
    private String color;
    private double height;
 public Tulip(){

    }
  public Tulip(String color,double height)
    {
      this.color=color;
      this.height=height;
    }
    public void setColor(String color)
    {
       this.color=color;  
    }
     public void setHeight(double height )
    {
       this.height=height;
    }
      public String getColor()
    {
       return color;
    }
     public double getHeight()
    {
       return height;
    }
     
     public Tulip mixedTulip(Tulip anotherTulip)
     {
         Tulip pinkTulip=new Tulip();
         
                 double ave=(this.height+anotherTulip.getHeight())/2;
                 pinkTulip.setHeight(ave);
                /// return pinkTulip;
                 pinkTulip.setColor("pink");
                         
              
              return pinkTulip;
              
     }
}
