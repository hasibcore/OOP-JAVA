
package batsmanselection;


public class Batsman {
    private int totalRuns,totalOuts;

    public Batsman() {
    }

    public Batsman(int totalRuns, int totalOuts) {
        this.totalRuns = totalRuns;
        if(totalOuts>10)
      {
          this.totalOuts=10;
      }
      else{
                this.totalOuts = totalOuts;  
      }
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(int totalRuns) {
      
        this.totalRuns = totalRuns;
    }

    public int getTotalOuts() {
        return totalOuts;
    }

    public void setTotalOuts(int totalOuts) {
      if(totalOuts>10)
      {
          this.totalOuts=10;
      }
      else{
                this.totalOuts = totalOuts;  
      }
    }
    
}
