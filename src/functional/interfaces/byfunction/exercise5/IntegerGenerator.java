package functional.interfaces.byfunction.exercise5;

import java.util.function.Supplier;

public class IntegerGenerator implements Supplier<Integer> {
    @Override
    public Integer get() {
        int intNumber = (int)Math.floor(Math.random()*101);
        return intNumber;
    }
}
