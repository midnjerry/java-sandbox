package variables;

public class BinaryAndHexNotation {
    public static void main(String[] args) {
        // If you want to input number as binary
        // Shortcut Bar: 16^2 16^1  16^0
        int x = 0b10101111; // AF =  (10 * 16) + (15 * 1)   160+15=175
        System.out.println(x);

        // If you want to input number as Hex
        int y = 0xAF;
        System.out.println(y);
    }
}
