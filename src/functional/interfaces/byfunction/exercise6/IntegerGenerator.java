package functional.interfaces.byfunction.exercise6;

import java.util.Random;
import java.util.function.Supplier;

public class IntegerGenerator implements Supplier<Integer> {
    Random rand = new Random();
    @Override
    public Integer get() {
        return null;
    }

    Supplier<Integer> randomInteger = () -> rand.nextInt();
}
