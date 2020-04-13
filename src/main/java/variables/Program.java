package variables;

public class Program {
    public static void main(String[] args) {
        // String concatenation - means putting two strings together
        System.out.println("|" + "**************");
        System.out.println("Hello Trinity!");
        System.out.println("**************");
        System.out.println("First" + " " +  "Last");
        System.out.println("First Last");

        // Variables
        // 1.) First I want to declare a variable.
        String name;

        // 2.) Initialize it.   First time you put something in the variable.
        name = "First Last";
        name = name + " Second thing";  //EXPRESSION  -  An expression is any value or combination of values you put in a variable.
                                       // 4 + 2 EVALUATES to 6
        // PUT THIS VALUE INTO NAME =>  name + " Second thing"
        //                          =>  "First Last" + " Second thing"
        //                          =>  "First Last Second thing"

        System.out.println("This is inside the name variable: " + name);

        // DECLARE and INITIALIZE at same time
        String color = "RED";

        name = name + " " + color;
        color = "BLUE";
        System.out.println(name);

        // these 4 data types all represent numbers without decimal.
        byte reallySmallInteger;  // 8 bits
        short smallInteger; // 16 bits = 2 bytes
        int integer;      // 32 bits = 4 bytes
        long bigInteger;  // 64 bits = 8 bytes

        // 1 2 3 4 5 6 7 8      bits
        // 0 1 0 0 0 1 1 0      binary value is actually a number
        // Binary is a BASE 2 System  (You only use 0 and 1)

        // Regular numbers use BASE 10.  that means there are 10 digits representing 0 - 9

        //    1
        // +  1
        // -------
        //    2      (in Base 10)   15 + 15 = 30
        //   10      (in Base 2)

        // Base 2    (Base 10)
        //   10      (2)
        // +  1      (1)
        // ------
        //   11      (3)

        // SHORT CUT!!!
        // Start from right to left, and write every number for 2^n starting from n = 0 (2^0 = 1)
        // 128 64 32 16 8 4 2 1  <==      Shortcut bar
        //   0  1  0  0 0 1 1 0  = Add all the top values with 1s
        //                         //64 + 4 + 2 = 70
        //     01000110 = 70
        //   - 00110111 = 55
        // -------------------
        //         1111 = 15

        // 128 64 32 16 8 4 2 1
        //   0  0  0  0 1 1 1 1  =   15

    }
}


// CTRL + ALT + L   -> reformats your code