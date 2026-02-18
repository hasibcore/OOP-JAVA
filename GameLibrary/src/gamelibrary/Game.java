
package gamelibrary;

public class Game {

    static int totalAvailableGames;

    
    public int gameId;
    public String title;
    public double rating;
   

    public Game(int gameId, String title, double rating) {
        this.gameId = gameId;
        this.title = title;
        this.rating = rating;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    

   
    public static int totalAvilableGames;
    public void printDetails()
    {
        System.out.println(gameId+" "+title+" "+rating);
    }
}
