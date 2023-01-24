package functional.interfaces.byfunction.exercise8;

import java.util.function.Function;

public class TransformIntToString implements Function<Integer, String> {

    @Override
    public String apply(Integer integer) {
        return String.valueOf(integer);
    }
}
