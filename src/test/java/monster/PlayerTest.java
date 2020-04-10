package monster;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void pretendYouAreWritingAMain(){
        Player p = new Player();
        assertEquals(75, p.hitPoints);
    }
}