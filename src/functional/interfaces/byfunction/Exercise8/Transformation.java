package functional.interfaces.byfunction.Exercise8;

import java.util.function.Function;

public class Transformation implements Function<String, Integer> {
    @Override
    public Integer apply(String s) {
        return null;
    }
    Function<String,Integer> transform = s -> Integer.parseInt(s);
}
