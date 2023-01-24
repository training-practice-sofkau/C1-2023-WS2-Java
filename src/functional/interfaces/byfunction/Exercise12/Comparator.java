package functional.interfaces.byfunction.Exercise12;

import java.util.function.BiFunction;

public class Comparator implements BiFunction<Integer,Integer,Boolean> {
    @Override
    public Boolean apply(Integer integer, Integer integer2) {
        if (integer>integer2){
            return true;
        }
        return false;
    }
}
