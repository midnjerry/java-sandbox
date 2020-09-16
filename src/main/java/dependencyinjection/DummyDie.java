package dependencyinjection;

public class DummyDie implements Die {

    int count = 0;

    @Override
    public int roll() {
        count++;
        switch(count){
            case(1): return 2;
            case(2): return 6;
            default: return 3;
        }
    }
}
