package conditionals;

public class IfElseStatement {
    public static void main(String[] args) {
        System.out.println("Welcome to our if-else lesson");
        // Declaring and initializing
        int x = 2;
        int y = 10;

        if (x > 3) {
            System.out.println("This is true.  X is greater than 3.");
        } else {
            System.out.println("This is false. X is not greater than 3.");
        }

        boolean answer = sleepIn(true, true);
        System.out.println("answer: " + answer);
        System.out.println("I'm running after the if-statement.  X is: " + x);

        if (x > 3 && y > 3){
            System.out.println("They're both greater!!!");
        } else {
            System.out.println("They're both not greater");
        }



    }

    // true, true => true
    // false, true => true
    // true, false => false;
    // false, false => true

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean weekend = !weekday;
        return vacation || weekend;

        //        if (vacation == true) {
//            return true;
//        }
//
//        return !weekday;
    }

    // add takes 2 int numbers and returns 1 int number
    public static int add(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }


}
