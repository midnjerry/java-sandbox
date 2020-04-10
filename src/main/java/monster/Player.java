package monster;

// A default contructor is already set for a class without a custom constructor
public class Player { //<ALT-ENTER to create a test
    public int hitPoints;
    public String name;

    public Player() {
        hitPoints = 75;
    }

    public  Player(String name){
            this.name = name;
    }

    public Player(int startingHitPoints) {
        hitPoints = startingHitPoints;
    }

    public Player(char ch) {
        if (ch == 'S') {
            hitPoints = 500;
        } else {
            hitPoints = 75;
        }
    }

    public void eatFood(){
        hitPoints = hitPoints + 10;
    }
}
