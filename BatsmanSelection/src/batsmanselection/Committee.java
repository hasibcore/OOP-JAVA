
package batsmanselection;


public class Committee {
  private int selectionCriteria;

    public Committee(int selectionCriteria) {
        this.selectionCriteria = selectionCriteria;
    }

    public int getSelectionCriteria() {
        return selectionCriteria;
    }

    public void setSelectionCriteria(int selectionCriteria) {
        this.selectionCriteria = selectionCriteria;
    }
  void calculatedAverage(Batsman b)
  {
      double average=(b.getTotalRuns()/b.getTotalOuts());
      System.out.println("Average of Batsman is : "+average);
      if(average>=selectionCriteria)
      {
          System.out.println("Batsman Selected.");
      }
      else
      {
          System.out.println("Batsman not Selected.");
      }
  }
}
