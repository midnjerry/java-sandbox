package conditionals;

import org.junit.Test;

import static org.junit.Assert.*;

public class WhileLoopsTest {

    long x = 1000000000;

    @Test
    public void sum1(){
        long counter = 1;
        long sum = 0;
        while (counter <= x){
            sum = sum + counter; // (0 + 1) -> (1 + 2)  ->  (3 + 3) -> (6 + 4) -> (10 + 5)
            counter = counter + 1;    // Increment
        } // <- when you're at this point, record your values on your chart.
        System.out.println("Sum: " + sum);
    }

    @Test
    public void sum2(){
        long sum2 = ((1 + x) * (x / 2)) + (x % 2) * (x + 1) / 2;
        System.out.println("Sum2: " + sum2);
    }

}