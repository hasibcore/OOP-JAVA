
package librarysystem;


public class Book extends Media {
 
    private double requiredLevel;

    public Book(double requiredLevel, String title, double baseScore) {
        super(title, baseScore);
        this.requiredLevel = requiredLevel;
    }

    public double getRequiredLevel() {
        return requiredLevel;
    }

    public void setRequiredLevel(double requiredLevel) {
        this.requiredLevel = requiredLevel;
    }
    
    @Override
    public double getSuitability(Member m1) {
        if(m1.getReadingLevel()<requiredLevel)
        {
            return 0;
        }
        else
        {
                return getBaseScore();
        }
    }
    
}
