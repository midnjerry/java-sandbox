package variables;

public class SignedAndUnsigned {
    public static void main(String[] args) {
        byte number; //Range is from -128 to 127

        number = (byte) 255;
        System.out.println(number);
        //1 1 1 1 1 1 1 1  =  -1    as a signed number

        number = (byte) 0xFF; //1 1 1 1  1 1 1 1
        System.out.println(number);

        number++;
        //1 1 1 1    1 1 1 1   =>   0 0 0 1  0 0 0 0   0 0 0 0
        System.out.println(number);

        //Let's try our own overload;
        number = (byte) 0x100;
        System.out.println(number);

        // Shortcut bar  =   16^2   16^1    16^0
        short shortNumber = (short) 0x100;
        System.out.println(shortNumber);

        // Shortcut bar for each hex digit =    8  4  2  1
        //0 1 1 1   1 1 1 1
        number = (byte) 0x7F;
        System.out.println(number);

        number++;
        //0 1 1 1   1 1 1 1 =>   1 0 0 0   0 0 0 0
        System.out.println("We're adding 1 to 0x7F: " + number);

        number++;
        //1 0 0 0   0 0 0 0  =>   1 0 0 0   0 0 0 1
        System.out.println("We're adding 1 to 0x80: " + number);

        //1 0 0 0   0 0 0 1   =>   81  =>   129
        System.out.println(Byte.toUnsignedInt(number));

        //You can do (2^n) - 1  to figure out the highest unsigned number for a data type
        //You can do (2^n) to figure the range of the data type.

        System.out.println("Highest long number: " + Long.MAX_VALUE);
        System.out.println("Highest int number: " + Integer.MAX_VALUE);
        System.out.println("Highest short number: " + Short.MAX_VALUE);
        System.out.println("Highest byte number: " + Byte.MAX_VALUE);
        System.out.println("Lowest long number: " + Long.MIN_VALUE);
        System.out.println("Lowest int number: " + Integer.MIN_VALUE);
        System.out.println("Lowest short number: " + Short.MIN_VALUE);
        System.out.println("Lowest byte number: " + Byte.MIN_VALUE);

    }


}
