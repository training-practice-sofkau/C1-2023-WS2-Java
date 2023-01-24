package functional.interfaces.byfunction.exercise6;

import java.util.List;
import java.util.function.Supplier;

public class StringGenerator implements Supplier<String> {
    @Override
    public String get() {
        //TO-DO: The logic in order to show a random string
        List<String> strings = List.of("Wish", "Seventeen", "Rust", "Down", "Oven", "Nine", "Hearth", "Homecoming", "One", "Wagon");

        int num = (int)Math.ceil(Math.random() * (strings.size()) - 1);

        return strings.get(num);
    }
}
