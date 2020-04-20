package arrays;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // You can make arrays with pretty much any data type
        // Declaring it
        String[] names;

        //Instantiate it here (allocate memory)
        names = new String[5];

        //Cool shortcut.   You can use the Java Arrays class to do cool things with arrays.

        System.out.println(Arrays.toString(names));

        //Initialize it here
        names[0] = "Anthony";
        names[1] = "Betsy";
        names[2] = "Charlie";
        names[3] = "David";
        names[4] = "Edith";

        System.out.println("Memory Address: " + names);
        System.out.println(Arrays.toString(names));

        for (int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }

        int index = 0;
        while (index < 5) {
            System.out.println(names[index]);
            index++;
        }

        // now let's look at length
        System.out.println("Length of array: " + names.length);

        //this is how you loop through every object of an array
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // Declare, instantiate, and initialize
        int[] numbers = {-4, 5, 23, 57, 1, -20, 128, 47, 26, 10, 7, 25, -50};
        System.out.println("Length of numbers array: " + numbers.length);
        System.out.println(Arrays.toString(numbers));
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + ", ");
        }
        System.out.println("]");

        // Let's find the maximum number of an array


    }


}
