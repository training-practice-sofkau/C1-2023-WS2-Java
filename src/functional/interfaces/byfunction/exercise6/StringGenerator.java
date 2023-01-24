package functional.interfaces.byfunction.exercise6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class StringGenerator implements Supplier<String> {

    Random random = new Random();
    List<String> names = new ArrayList<>(Arrays.asList("Selma", "Paty", "Bart", "Homer", "Lisa"));
    @Override
    public String get() {
        return null;
    }
    Supplier<String> randStr = () -> names.get(random.nextInt(names.size()));
}



