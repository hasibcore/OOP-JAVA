
package gamelibrary;


public class LibraryHelper {
    public static String[] filterByRating(Game[] game,double rating)
    {
        int n=0;
        String[] gameName=new String[game.length];
        for(int i=0;i<game.length;i++)
        {
          if(game[i].getRating()>rating)
          {
            gameName[n]=game[i].getTitle();
            n++;
          }
          
        }
        return gameName;
    }
    public static void printAllGames(Game[] game)
    {
        for (Game game1 : game) {
            System.out.println(game1.getGameId() + " " + game1.getTitle() + " " + game1.getRating());
        }
        
    }
}
