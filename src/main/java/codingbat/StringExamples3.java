package codingbat;

public class StringExamples3 {
    public static void main(String[] args) {
        String str = "kitten";

        // n = 4
        // 0 1 2 3 4 5 6
        // k i t t e n

        String first = str.substring(0, 4); // "kitt"
        String middle = str.substring(4, 5);  // "e"
        String last = str.substring(5); // "n"
        displaySubStrings(first, middle, last);


        // n = 2
        // 0 1 2 3 4 5 6
        // k i t t e n

        first = str.substring(0, 2);  // "ki"
        middle = str.substring(2, 3);  // "t"
        last = str.substring(3);  // "ten"
        displaySubStrings(first, middle, last);

        // n = 0
        // 0 1 2 3 4 5 6
        // k i t t e n
        first = str.substring(0, 0); // ""
        middle = str.substring(0, 1); // "k"
        last = str.substring(1);  // "itten"
        displaySubStrings(first, middle, last);
        // return first + last
        // "itten"

        // n = 5
        // 0 1 2 3 4 5 6
        // k i t t e n
        first = str.substring(0, 5);  // "kitte"
        middle = str.substring(5, 6); // "n"
        last = str.substring(6); //  ""
        displaySubStrings(first, middle, last);
    }

    private static void displaySubStrings(String first, String middle, String last) {
        System.out.print("First: \"" + first + "\", ");
        System.out.print("Middle: \"" + middle + "\", ");
        System.out.print("Last: \"" + last + "\"\n");
    }
}
