
package gamedemo;

import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Player Name : ");
        String name=sc.nextLine();
        System.out.print("Player Health : ");
        int health=sc.nextInt();
        System.out.print("Threshold : ");
        int threshold=sc.nextInt();
        Player p1=new Player(name,health);
        LevelManager L1=new LevelManager(threshold);
        L1.checkPlayer(p1);
    }
    
}
