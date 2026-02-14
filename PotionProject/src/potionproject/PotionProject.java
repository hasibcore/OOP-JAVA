
package potionproject;
import java.util.Scanner;
public class PotionProject {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        Potion p1=new Potion();
        Potion p2=new Potion();
       PotionBrewer brewer=new PotionBrewer();
        System.out.println("Potion 1 \n");
       System.out.print("Volume : ");
         p1.setVolume(sc.nextInt());
         sc.nextLine();
         System.out.print("\nEffect :");
         p1.setEffect(sc.nextLine());
       
         
        System.out.println("Potion 2 \n");
         System.out.print("Volume : ");
         p2.setVolume(sc.nextInt());
         sc.nextLine();
         System.out.print("\nEffect");
        p2.setEffect(sc.nextLine());
    
        Potion newPotion1=brewer.brewPotion(p1.getVolume(),p2.getVolume());
        
        Potion newPotion2=brewer.brewPotion(p1,p2);
        System.out.println("New Potion 1 \n");
       System.out.print("\nVolume : "+newPotion1.getVolume()); 
       System.out.print("\nEffect : "+newPotion1.getEffect());
    
        System.out.println("New Potion 2 \n");
       System.out.print("\nVolume : "+newPotion2.getVolume()); 
       System.out.print("\nEffect : "+newPotion2.getEffect()); 
    }
} 

