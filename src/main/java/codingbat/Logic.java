package codingbat;

public class Logic {
    public static void main(String[] args) {
        answerCell(true, true, true);
    }

    // isMorning | isMom | isAsleep
    // false     | true  | false
    // false     | false | false
    // true      | true  | false
    // ----------------------------
    // these combos should return true

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        boolean combo1 = (!isMorning && isMom && !isAsleep);
        System.out.println(combo1);




        //return (!isMorning && !isAsleep) || (isMorning && isMom && !isAsleep);

        return (   (!isMorning && isMom && !isAsleep)
                || (!isMorning && !isMom && !isAsleep)
                || (isMorning && isMom && !isAsleep));

    }

}
