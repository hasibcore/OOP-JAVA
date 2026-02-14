
package potionproject;


public class Potion {
    private int volume;
    private String effect;
    public Potion()
    {
        
    }
  public Potion(int volume,String effect)
  {
      this.volume=volume;
      this.effect=effect;
  }
 public void setVolume(int volume)
  {
      this.volume=volume;
  }
 public void setEffect(String effect)
  {
      this.effect=effect;
  }
  public int getVolume()
  {
     return volume;
  }
  public String getEffect()
  {
      return effect;
  }
}
