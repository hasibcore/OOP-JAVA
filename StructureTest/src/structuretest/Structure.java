
package structuretest;

public class Structure {
    private double structureVolume;

    public Structure(double structureVolume) {
        if(structureVolume<0)
        {
            this.structureVolume = -structureVolume;
            setStructureVolume(-structureVolume);
        }
        else{
             this.structureVolume = structureVolume;
             setStructureVolume(structureVolume);
        }
       
    }

    public double getStructureVolume() {
        return structureVolume;
    }

    public void setStructureVolume(double structureVolume) {
        this.structureVolume = structureVolume;
    }
    
}
