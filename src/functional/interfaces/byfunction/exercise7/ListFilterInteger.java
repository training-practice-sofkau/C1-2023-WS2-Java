package functional.interfaces.byfunction.exercise7;

import java.util.function.Predicate;

public class ListFilterInteger implements Predicate<Integer> {

    @Override
    public boolean test(Integer s) {
        return (s > 9);
    }
}
