package dependencyinjection;

import java.util.Random;

public class SixSidedDie implements Die {

    @Override
    public int roll() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}