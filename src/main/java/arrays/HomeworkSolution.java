package arrays;

public class HomeworkSolution {
    /**
     * Find the max and min numbers for the given integer array
     * @param args
     */
    public static void main(String[] args) {
        // int[] numbers = {-5, 5, 23, 57, 1, -20, 128, 47, 26, 10, 7, 25, -50};
        int[] numbers = {-4, -10, -20, -15, -3, -2};
        int max = numbers[0];

        // {-4}       -4
        // {-4, 5}    5
        // {-4, 5, 23}    23
        // {-4 5 23 57}   57
        // {-4 5 23 57 1} 57
        // {-4 5 23 57 1 -20}  57
        int[] numbers2 = {5, 1, 6, 24, 1, 2, 3, 5, 6, 20, 34, 12, 108, 23};

        // Initial State
        // Expression
        // Increment

        for (int i = 1; i < numbers.length; i++){
            System.out.println(i + " : " + numbers[i]);
            if (numbers[i] > max){
                // numbers[i] = max   <--- this replaces the value in numbers[i]
                max = numbers[i];
            }
        }

        System.out.println("Max number is: " + max);
    }
}
