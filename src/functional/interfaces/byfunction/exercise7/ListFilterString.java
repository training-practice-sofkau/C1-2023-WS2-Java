package functional.interfaces.byfunction.exercise7;

import java.util.function.Predicate;

public class ListFilterString implements Predicate<String> {

    @Override
    public boolean test(String s) {
        return (s.length()>9);
    }
}
