
package codetest;


public class Code {
    private double linesOfCode;

    public Code(double linesOfCode) {
        if(linesOfCode<=200)
        {
            this.linesOfCode=250;
        }
        else
        {
         this.linesOfCode = linesOfCode;   
        }
        
    }

    public double getLinesOfCode() {
        return linesOfCode;
    }

    public void setLinesOfCode(double linesOfCode) {
        if(linesOfCode<=200)
        {
            this.linesOfCode=250;
        }
        else
        {
         this.linesOfCode = linesOfCode;   
        }
    }
    void displayCode()
    {
        System.out.println("Lines of code : "+getLinesOfCode());
    }
}
