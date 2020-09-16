package dependencyinjection;

import org.junit.Test;

import static org.junit.Assert.*;

public class FighterTest {

    @Test
    public void attack_isSumOfThreeRolls(){
        Fighter testFighter = new Fighter(new DummyDie());
        //Customer wants the Fighter damage to be calculated as follows:
        // sum of 3 die rolls

        assertEquals(11, testFighter.attack());
    }

}