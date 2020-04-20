package conditionals;

public class WhileLoops {
    public static void main(String[] args) {
        // You need three things for a while loop.
        // 1.) Initial State - you need a starting point
        // 2.) Boolean expression - loop runs when true
        // 3.) Something to increment

        // variable evaluates the expression and stores the result in variable
        boolean expression = true;     // Initial State
        while (expression){            // Expression
            System.out.println("Hi Atiyya and Trinity.");
            //This ensures that it's only run once.
            expression = false;        // Increment
        }

        /**
         * Problem:  Get sum of all numbers from 1 - 100
         */

        /**
         * Mini-Problem: Get sum of all number from 1 - 5
         *
         * 1.) Solve it manually first.
         * 2.) Look for patterns.
         *
         * sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
         *
         * 1 + 10, 2 + 9, 3 + 8, 4 + 7, 5 + 6
         * 11 * 5
         *
         * 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5
         * 10 + 10 + 10 + 10 + 5
         *
         * sum = 1 + 2 + 3 + 4 + 5
         * sum = 15
         * counter = 1 + 1 + 1 + 1 + 1
         *                     [0 - 1]
         * ((1 + x) * x / 2) + (x % 2) * (x + 1) / 2;
         * Extra Credit:
         * 1, 2, 3, 4, 5   =>   1, 5, 2, 4, 3
         * 1, 5, 2, 4, 3 => (1 +5) + (2 + 4) + 3
         * 6 + 6 + 3
         *
         *
         *
         *
         */

        // Initial state
        long sum = 0;
        int counter = 1;

        long x = 1000000000;

        long sum2 = ((1 + x) * (x / 2)) + (x % 2) * (x + 1) / 2;
        System.out.println("Sum2: " + sum2);

        // Boolean expression - only run loop if true
        while (counter <= x){
            sum = sum + counter; // (0 + 1) -> (1 + 2)  ->  (3 + 3) -> (6 + 4) -> (10 + 5)
            counter = counter + 1;    // Increment
        } // <- when you're at this point, record your values on your chart.

        // Using loops is much easier if you draw a chart
        // counter   |   sum
        //    1      |    0     // Initial
        //    2      |    1     // End of Loop
        //    3      |    3
        //    4      |    6
        //    5      |    10
        //    6      |    15    // STOPS

        System.out.println("Counter: " + counter);
        System.out.println("Sum: " + sum);



    }
}
