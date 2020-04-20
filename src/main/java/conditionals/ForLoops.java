package conditionals;

public class ForLoops {
    public static void main(String[] args) {
        System.out.println("For loop examples");

        System.out.println("Example 1: Run 10 times");
        for (int i = 0; i < 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Example 2: Run 10 times");
        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("******* Example where you initialize outside ********");
        int j = 0;

        for (;j<=10;j++){
            System.out.print(j + " ");
        }

        System.out.println("k  |  i");
        for (long k = 0, i = 4; k * i < 8; k++, i++){
            System.out.println(k + " | " + i + " | " + (i)*(k));
        }
    }
}
