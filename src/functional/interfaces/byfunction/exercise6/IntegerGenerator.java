package functional.interfaces.byfunction.exercise6;

import java.util.Random;
import java.util.function.Supplier;

public class IntegerGenerator implements Supplier<Integer> {

    @Override
    public Integer get() {
        return new Random().nextInt(10);
    }
}
