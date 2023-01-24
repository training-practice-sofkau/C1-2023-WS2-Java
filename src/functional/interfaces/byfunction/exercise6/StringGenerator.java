package functional.interfaces.byfunction.exercise6;

import java.util.List;
import java.util.function.Supplier;

public class StringGenerator implements Supplier<String> {
    @Override
    public String get() {
        //TO-DO: The logic in order to show a random string

        List<String> randomStrings =List.of("Java","Hello","World","Dog","Cat","Car");

        return randomStrings.get((int)(Math.random()*randomStrings.size()));
    }
}
