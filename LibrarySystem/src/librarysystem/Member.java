
package librarysystem;

/**
 *
 * @author Hasan
 */
public class Member {
    private String name;
    private int readingLevel;

    public Member(String name, int readingLevel) {
        this.name = name;
        this.readingLevel = readingLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReadingLevel() {
        return readingLevel;
    }

    public void setReadingLevel(int readingLevel) {
        this.readingLevel = readingLevel;
    }
    
}
