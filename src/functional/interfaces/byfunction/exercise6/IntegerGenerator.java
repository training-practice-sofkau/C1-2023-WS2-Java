package functional.interfaces.byfunction.exercise6;

import java.util.function.Supplier;

public class IntegerGenerator implements Supplier<Integer> {
    @Override
    public Integer get() {
        return (int)( Math.random()*1000);
    }
}
