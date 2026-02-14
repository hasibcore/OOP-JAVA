
package gamedemo;

public class Player {
    private String playerName;
    private int playerHelth;

    public Player(String playerName, int playerHelth) {
        this.playerName = playerName;
        this.playerHelth = playerHelth;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerHelth() {
        return playerHelth;
    }

    public void setPlayerHelth(int playerHelth) {
        this.playerHelth = playerHelth;
    }
    
}
