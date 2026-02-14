
package medicaldemo;


public class Patient {
    private String name;
    private double bodyTemp;
    private int duration;

    public Patient() {
    }

    public Patient(String name, double bodyTemp, int duration) {
        this.name = name;
        this.bodyTemp = bodyTemp;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(double bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    String diafnosePatient()
    {
        if(getBodyTemp()>=103 && getDuration()>7)
        {
          return "Dengue";  
        }
        else if(getBodyTemp()>=100 && getDuration()<7)
        {
            return "Common Fever";
        }
        else{
            return "Nothing";
        }
    }
}
