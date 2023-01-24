package functional.interfaces.byfunction.exercise6;

import java.util.function.Supplier;

public class IntegerGenerator implements Supplier<Integer> {
    @Override
    public Integer get() {
        int num = (int)Math.ceil(Math.random() * 1000000);

        return num;
    }
}
