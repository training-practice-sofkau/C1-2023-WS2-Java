package functional.interfaces.byfunction.exercise8;

import java.util.function.Function;

public class Converter implements Function<String, Integer> {
    @Override
    public Integer apply(String s) {
        return null;
    }

    Function<String, Integer> str2Int = s -> Integer.parseInt(s);
}
