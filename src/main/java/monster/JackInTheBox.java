package monster;

public class JackInTheBox {
    // States
    // Box is Closed
    // Clown is Out (Or box is open)
    private boolean open; //false
    private int count;

    public boolean isOpen(){
        return open;
    }

//    //Setter
//    public void setCount(int x){
//        count = x;
//    }



    //Getter
    public int getCount(){
        return count;
    }

    // defaults to either null, 0, false

    // Actions
    public void turnCrank(){
        System.out.println("Turning crank");
        count = count + 1;
        if (count == 3){
            popOpen();
        }
    }

//    public void turnCrankXTimes(int x){
//        if (x < 0) {
//            return;
//        }
//        if (x >= 3){
//            x = 3;
//        }
//
//        for (int i = 0; i < x; i++){
//            turnCrank();
//        }
//    }

    private void popOpen(){
        System.out.println("Boo!");
        open = true;
    }

    public void pushClownDown() {
        if (count < 3){
            System.out.println("Pushing top of box down");
            return;
        }
        System.out.println("Pushing clown down");
        open = false;
        count = 0;
    }

}

class JProgram {
    public static void main(String[] args) {
        // Declaring it
        JackInTheBox j;

        // Initializing it (first time i put a value into j)
        j = null;

        // Now I'm INSTANTIATING JackInTheBox and putting it in j
        // We now have an INSTANCE of JackInTheBox in memory.
        j = new JackInTheBox();
        // First crank
        j.turnCrank();
        System.out.println("Is Open: " + j.isOpen());
        System.out.println(j.getCount());


        j.turnCrank();
        System.out.println("Is Open: " + j.isOpen());
        System.out.println(j.getCount());

        j.turnCrank();
        System.out.println("Is Open: (should be true) " + j.isOpen());
        System.out.println(j.getCount());

        j.pushClownDown();
        System.out.println("Is Open: (should be false)" + j.isOpen());
        System.out.println("Count should be 0: " + j.getCount());

        j.turnCrank();
        j.pushClownDown();
        j.turnCrank();
        j.turnCrank();
        System.out.println("Is Open: (should be true) " + j.isOpen());
        System.out.println(j.getCount());
    }
}