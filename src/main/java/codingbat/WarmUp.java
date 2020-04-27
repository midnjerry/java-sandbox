package codingbat;

public class WarmUp {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str);

        System.out.println(str.substring(1));
        // 0 1 2 3 4 5
        // H e l l o
        // -----------
        //   e l l o

        System.out.println(str.substring(1,3));
        // 0 1 2 3 4 5
        // H e l l o
        //   e l

        // n = 4
        // 0 1 2 3 4 5 6
        // R a b b i t     =>   str.substring(0, 3);
        // ------------
        // R a b b t


        int n = 0;
        str = "Rabbit";
        System.out.println("Answer: " + str.substring(0, n) + str.substring(n + 1));
        System.out.println(str);

    }

    public static boolean makes10(int a, int b) {
        return (a + b == 10 || a == 10 || b == 10);
    }

    public static int diff21(int n){
        int diff = n - 21;
        if (diff < 0) {
            // difference is guaranteed to be negative
            diff = diff * -1;  // converting it to positive.
        }

        // GUARANTEED TO HAVE A NON-NEGATIVE NUMBER inside diff
        if (n > 21){
            diff = diff * 2;
        }

        return diff;
    }

    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative == true && a < 0 && b < 0) {
            return true;
        }

        if (!negative && a < 0 && b > 0) {
            return true;
        }

        if (negative == false && a > 0 && b < 0) {
            return true;
        }

        return false;
    }

    public static boolean or35(int n) {
        // How can i determine if n is multiple of 3.
        System.out.println(n / 3);

        int temp = n / 3;
        int product = temp * 3;
        if (n == product) {
            return true;
        }

        // calculate if multiple of 5
        if (n % 5 == 0) {
            return true;
        }

        return false;

        // MOD doesn't divide, it gives you the remainder of the "division" problem.
        // 5 % 2  gives you 1.  because 5 / 2 = 2 remainder 1
        // 4 % 2 gives you 0.
        // 15 % 3 gives you 0.
        // 21 % 3 gives you 0.
        // 22 % 3 gives you 1.  because 22 / 3 = 7 remainder 1


        // 4 / 3 = 1
        // 3 * 1 = 3

        // 3 / 3 = 1
        // 3 * 1 = 3   (they match)

        // 25 / 3 = 8
        // 8 * 3 = 24  (not a match)

        // 0, 3, 6, 9, 12, 15, 18, 21

        //  12 / 3 = 4....   4 * 3 -> 12

        //  13 / 3 = 4....   4 * 3 -> 12

        // n / 3 = temp....  temp * 3 => product
        // if (n==product) then n is a multiple of 3.

    }



}
