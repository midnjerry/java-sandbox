package arrays;

import java.sql.SQLOutput;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] numbers = new int[]{-4, 5, 23, 57, 1, -20, 128, 47, 26, 10, 7, 25, -50};
        System.out.println("Length: " + numbers.length);

        String[] names = {"Anthony", "Betsy", "Clark"};
        System.out.println("Length of names array: " + names.length);

        String[] nullArray = new String[4];  // allocating 4 String in the Heap
        System.out.println("Length of nullArray: " + nullArray.length);

        // Memory addresses of the arrays
        System.out.println(names);
        System.out.println(numbers);
        System.out.println(nullArray);

        // Now to access the elements
        System.out.println("******");
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        // These lines cause errors - ArrayIndexOutOfBoundsException
        // System.out.println(names[-1]);
        // System.out.println(names[3]);
        // System.out.println(nullArray[nullArray.length]);

    }
}
