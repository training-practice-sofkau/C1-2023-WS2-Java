package functional.interfaces.byfunction.exercise6;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class IntegerGenerator implements Supplier<Integer> {

    @Override
    public Integer get() {
        int random = ThreadLocalRandom.current().nextInt();
        return random;
    }
}
