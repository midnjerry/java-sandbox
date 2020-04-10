import monster.Player;
import monster.Zombie;

import java.util.ArrayList;
import java.util.List;

public class ZombieGame {
    public static void main(String[] args) {
        System.out.println("*******************************************");
        String t = getString(); // EVALUATES TO "HI"
        System.out.println(t);
        System.out.println(getString());
        Player player = new Player("Jerry");  //Hit Alt-enter
        System.out.println(player);
        System.out.println(player);
        System.out.println("Player: " + player.hitPoints);
        System.out.println("*******************************************");
    }

    public static String getString(){
        return "HI";
    }
}
