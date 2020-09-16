package dependencyinjection;

public class Fighter {

    Die d;

    public Fighter(){
        this(new SixSidedDie());
    }

    protected Fighter(Die die){
        d = die;
    }

    public int attack() {
        int r1 = d.roll();
        int r2 = d.roll();
        int r3 = d.roll();

        int damage = r1 + r2 + r3;


        System.out.println("Fighter does " + damage + " hit points of damage! ("
                + r1 + ", " + r2 + ", " + r3 + ")");
        return damage;
    }



}
