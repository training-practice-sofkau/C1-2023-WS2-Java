package functional.interfaces.byfunction.exercise8;

import java.util.function.Function;

public class FromIntegerToString implements Function<Integer,String> {

    @Override
    public String apply(Integer s) {
        return String.valueOf(s);
    }
}
