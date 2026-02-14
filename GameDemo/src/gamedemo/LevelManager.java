
package gamedemo;

public class LevelManager {
    private int lifeThreshold;

    public LevelManager(int lifeThreshold) {
        this.lifeThreshold = lifeThreshold;
    }

    public int getLifeThreshold() {
        return lifeThreshold;
    }

    public void setLifeThreshold(int lifeThreshold) {
        this.lifeThreshold = lifeThreshold;
    }
    void checkPlayer(Player p)
    {
        if(p.getPlayerHelth()<=getLifeThreshold())
        {
            System.out.println(p.getPlayerName()+" is Dead.");
        }
        else{
            System.out.println(p.getPlayerName()+" is Alive.");
        }
    }
}
