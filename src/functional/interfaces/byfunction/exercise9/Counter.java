package functional.interfaces.byfunction.exercise9;

import java.util.Arrays;
import java.util.function.Function;

public class Counter implements Function<String, Integer> {
    @Override
    public Integer apply(String s) {
        return null;
    }

    Function<String, Integer> str2Int = s -> s.split("\\s+").length;
}
