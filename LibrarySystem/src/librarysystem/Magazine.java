
package librarysystem;
public class Magazine extends Media {
   private double optimalLevel;
    

   
    public Magazine(double optimalLevel , String title, double baseScore) {
        super(title, baseScore);
        this.optimalLevel=optimalLevel;
    }
    void setOptimalLevel(double optimalLevel)
    {
        this.optimalLevel=optimalLevel;
    }
 public double getOptimalLevel() {
        return optimalLevel;
    }
    
   @Override
    public double getSuitability(Member m1){
       double z = getBaseScore() - (m1.getReadingLevel() - optimalLevel);
        return z;
    }
}
