package codingbat;

public class StringExamples2 {
    public static void main(String[] args) {
        String example = "Hello World";
        System.out.println(example);

        // Length method: Returns the number of characters per string
        // You can call length() from any string, not just variables.
        // Remember escape sequences look like 2 characters, but they're only one.
        // Examples: \" -> "   \\ -> \    \n -> newline
        System.out.println("\"");
        System.out.println("\"".length());
        System.out.println("Input:".length());
        System.out.println("Input:\0".length());
        System.out.println(example.length());

        // Escape characters
        System.out.println("***");
        System.out.println("\t  backslash: \\  \"Quote\"\n");
        System.out.println("***");

        // charAt
        System.out.println(example.charAt(example.length() - 1));
        System.out.println("The first character: " + example.charAt(0));
        System.out.println("The last character: " + example.charAt(example.length() - 1));
        for (int i = 0; i < example.length(); i++) {
            System.out.println(example.charAt(i));
        }

        // substring
        // 0 1 2 3 4 5 6 7 8 9 10 11 12
        // H e l l o   W o r l d

        System.out.println("Should produce \"ll\": " + example.substring(2, 4));
        System.out.println("Should produce \"o Wor\": " + example.substring(4, 9));

        //Edge cases
        System.out.println("Should produce \"World\": " + example.substring(6, example.length()));
        // There is a shortcut for ending at example.length()... that is:
        System.out.println("Should produce \"World\": " + example.substring(6));
        System.out.println("Should produce \"rld\": " + example.substring(8));

        // Example problem.
        // Swap the first and last letters of a input string.
        String input = "Hello World";
        String expect = "dello WorlH";

        char front = input.charAt(0);
        char back = input.charAt(example.length() - 1);
        String middle = input.substring(1, example.length() - 1);
    }
}
