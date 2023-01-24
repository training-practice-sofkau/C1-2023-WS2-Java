package functional.interfaces.byfunction.exercise6;

import java.util.function.Supplier;

public class IntegerGenerator implements Supplier<Integer> {
    @Override
    public Integer get() {
        //returns a number of 3 digits
        return (int) (Math.random() * 1000);
    }
}
