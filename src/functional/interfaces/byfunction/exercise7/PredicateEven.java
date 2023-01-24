package functional.interfaces.byfunction.exercise7;

import java.util.function.Predicate;

public class PredicateEven implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        if (integer%2 == 0){
            return true;
        }
        return false;
    }
}
