
package structuretest;

public class DevelopStructure {

    public DevelopStructure() {
    }
    public Structure produceStructure(double radius)
    {
        double vol1=(4.0/3.0)*Math.PI*Math.pow(radius,3);
       Structure s1=new Structure(vol1);
        return s1;
    }
    public Structure produceStructure(double radius,double height)
    {
        double vol2=(1.0/3.0)*Math.PI*Math.pow(radius,2)*height;
        Structure s2=new Structure(vol2);
        return s2;
    }
    public Structure produceStructure(double base,double height,double length)
    {
        double vol3=(1.0/2.0)*base*length*height;
        Structure s3=new Structure(vol3);
        return s3;
    }
   
}
