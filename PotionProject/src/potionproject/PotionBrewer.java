
package potionproject;


public class PotionBrewer {
  public Potion brewPotion(int volume1,int volume2)
  {
    int sum=volume1+volume2;
    if(sum>=200)
    {
        sum=200;
    }
    Potion obj=new Potion(sum,"Mixed");
    return obj;
  }
  
  public Potion brewPotion(Potion obj1,Potion obj2)
  {
      Potion mixpotion=new Potion();
      int ave=(obj1.getVolume()+obj2.getVolume())/2;
      if(obj1.getEffect().equals("Healing" )&& obj2.getEffect().equals("Strength"))
      {
          mixpotion.setEffect("Invincibility");
      }
     else if(obj1.getEffect()=="Speed" && obj2.getEffect()=="Neutral")
      {
          mixpotion.setEffect("Swiftness");
      }
      else
      {
        mixpotion.setEffect("Unknown");   
      }
      return mixpotion;
  }
}
