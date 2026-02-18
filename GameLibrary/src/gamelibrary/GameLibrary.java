
package gamelibrary;

import java.util.Scanner;

public class GameLibrary {

  
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Number of Games : ");
        int no=sc.nextInt();
        Game[] game=new Game[no];
        for(int i=0;i<no;i++)
        {
            System.out.println("Game "+(i+1)+" Id ");
            int id=sc.nextInt();
            System.out.println("Game "+(i+1)+" Rating ");
            double rating=sc.nextDouble();
            System.out.print("\nGame "+(i+1)+" Title ");
            sc.nextLine();
            String name=sc.nextLine();
            game[i]=new Game(id,name,rating);
            Game.totalAvailableGames=i+1;
        }
        System.out.println("Filter Rating : ");
        double rate=sc.nextDouble();
        String[] nameArray=LibraryHelper.filterByRating(game, rate);
        for(int i=0;i<nameArray.length;i++)
        {
            if(nameArray[i]!=null)
            {
                 System.out.println(nameArray[i]);
            }
           
        }
        LibraryHelper.printAllGames(game);
        System.out.println("Total Books Created "+Game.totalAvailableGames);
    }
    
}
