package variables;

public class OtherVariables {
    public static void main(String[] args) {
        //Declaring the variable
        boolean flag;

        //Initializing it
        flag = true;

        System.out.println(flag);

        // Boolean Operators
        // &&, ||, !, ^

        //Not
        System.out.println(!flag);

        //Funny brain teaser
        System.out.println(!!flag);

        // && or AND means both must be true
        boolean expression = true && false;
        System.out.println("Expression evaluates to: " + expression);

        expression = true && true;
        System.out.println("Expression evaluates to: " + expression);

        expression = true && true && false;
        System.out.println("Expression evaluates to: " + expression);

        // || or OR means any must be true;
        expression = true || true;
        System.out.println("Expression evaluates to: true || true" + expression);

        expression = true || false;
        System.out.println("Expression evaluates to: true || false" + expression);

        expression = false || false;
        System.out.println("Expression evaluates to: false || false" + expression);

        expression = true || false || true || false;
        System.out.println("Expression evaluates to: true || false || true || false" + expression);

        // ^ or XOR which means both MUST BE DIFFERENT
        expression = true ^ true;
        System.out.println("Expression evaluates to: " + expression);

        expression = true ^ false;
        System.out.println("Expression evaluates to: " + expression);

        expression = false ^ true;
        System.out.println("Expression evaluates to: " + expression);

        expression = false ^ false;
        System.out.println("Expression evaluates to: " + expression);
    }
}
