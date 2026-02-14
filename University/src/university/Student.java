
package university;


public class Student extends Person {
    private double[] marks;
    public Student(String name,double[] marks)
    {
        super(name);
        this.marks=marks;
    }
    public double getAverage()
    {
        double sum=0;
        for(int i=0;i<marks.length;i++)
        {
            sum=sum+marks[i];
        }
        return sum/marks.length;
    }
    void showInfo()
    {
        super.showInfo();
          System.out.println("Average Marks: "+getAverage());
        
    }
}
