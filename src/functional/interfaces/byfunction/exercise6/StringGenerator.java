package functional.interfaces.byfunction.exercise6;

import java.util.Random;
import java.util.function.Supplier;

public class StringGenerator implements Supplier<String> {

    int leftLimit = 97;
    int rightLimits = 122;
    int stringLength = 10;
    Random random = new Random();
    @Override
    public String get() {

        return random.ints(leftLimit, rightLimits -1)
                .limit(stringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
