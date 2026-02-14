
package studenttest;
public class Appliance {
    private double powerConsumption;

    public Appliance(double powerConsumption) {
      if(powerConsumption<2000)
        {
            this.powerConsumption = 2500;
        }
        else
         {
            this.powerConsumption = powerConsumption;
         }    
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        if(powerConsumption<2000)
        {
            this.powerConsumption = 2500;
        }
        else
         {
            this.powerConsumption = powerConsumption;
         }    
       }
    void displayConsumption()
    {
        System.out.println("Power Consumption : "+getPowerConsumption());
    }
}
