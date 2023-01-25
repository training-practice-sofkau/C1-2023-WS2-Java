package functional.interfaces.byfunction.exercise8;

import java.util.function.Function;

public class FromStringToInteger implements Function<String,Integer> {

    @Override
    public Integer apply(String s) {
        return Integer.parseInt(s);
    }
}
