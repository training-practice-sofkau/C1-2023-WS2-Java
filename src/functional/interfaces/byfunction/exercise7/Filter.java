package functional.interfaces.byfunction.exercise7;

import java.util.function.Predicate;

public class Filter implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer % 2 == 0;
    }
}
