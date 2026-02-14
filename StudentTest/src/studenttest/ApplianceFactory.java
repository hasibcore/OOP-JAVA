
package studenttest;

public class ApplianceFactory {
 
    Appliance createdAppliance(double voltage)
    {
        Appliance ap1=new Appliance(5*voltage);
        return ap1;
    }
    Appliance createdAppliance(double voltage,double current)
    {
        Appliance ap2=new Appliance(current*voltage);
        return ap2;
    }
    Appliance createdAppliance(int hours,int powerRating,double efficiency)
    {
        Appliance ap3=new Appliance((powerRating/efficiency)*hours);
        return ap3;
    }
}
