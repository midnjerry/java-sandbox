package monster;

import org.junit.Test;

import static org.junit.Assert.*;

public class JackInTheBoxTest {


    @Test
    public void whenJackInTheBoxIsCreated_ShouldBeClosed(){
        JackInTheBox j = new JackInTheBox();
        assertEquals(false, j.isOpen());
    }

    @Test
    public void crankOnce_ShouldBeClosed(){
        JackInTheBox j = new JackInTheBox();
        j.turnCrank();
        assertEquals(false, j.isOpen());
    }

    @Test
    public void crankTwice_ShouldBeClosed(){
        JackInTheBox j = new JackInTheBox();
        j.turnCrank();
        j.turnCrank();
        assertEquals(false, j.isOpen());
    }

    @Test
    public void crankThreeTimes_ShouldBeOpen(){
        JackInTheBox j = new JackInTheBox();
        j.turnCrank();
        j.turnCrank();
        j.turnCrank();
        assertEquals(true, j.isOpen());
    }

    @Test
    public void pushDownOnOpenBox_ShouldBeClosed(){
        JackInTheBox j = new JackInTheBox();
        j.turnCrank();
        j.turnCrank();
        j.turnCrank();
        j.pushClownDown();
        assertEquals(false, j.isOpen());
    }

    @Test
    public void pushDownOnBoxDuringMidCrank_StillOpensAfterThirdCrank(){
        JackInTheBox j = new JackInTheBox();
        j.turnCrank();
        j.pushClownDown();
        j.turnCrank();
        j.turnCrank();
        assertEquals(true, j.isOpen());
    }


}