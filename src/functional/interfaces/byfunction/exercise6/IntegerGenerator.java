package functional.interfaces.byfunction.exercise6;

import java.util.Random;
import java.util.function.Supplier;

public class IntegerGenerator implements Supplier<Integer> {
    Random random = new Random();
    @Override
    public Integer get() {
        return null;
    }
    Supplier<Integer> randInt = () -> random.nextInt();
}
