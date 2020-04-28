package codingbat;

public class StringExamples {
    public static void main(String[] args) {
        String example = "alphabet";
        System.out.println(example);
        System.out.println(example.substring(1, example.length() - 1));
        System.out.println((example.length()));
        // 0 1 2 3 4 5 6 7 8
        // a l p h a b e t

        example = "apple";
        System.out.println(example);
        System.out.println(example.substring(1, example.length() - 1));
        System.out.println((example.length()));
        // 0 1 2 3 4 5 6 7
        // a p p l e

        System.out.println(example.charAt(example.length()-1));

        System.out.println(example.charAt(0));

        char first = example.charAt(0);
        String middle = example.substring(1, example.length() - 1);
        char last = example.charAt(example.length() - 1);

        String answer = last + middle + first;
        System.out.println("Answer: " + answer);

        example = "example";
        System.out.println(example);
        System.out.println(example.substring(1, example.length() - 1));
        // 0 1 2 3 4 5 6 7
        // e x a m p l e

        System.out.println((example.length()));

    }
}
