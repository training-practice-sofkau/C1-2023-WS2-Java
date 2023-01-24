package functional.interfaces.byfunction.exercise6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class StringGenerator implements Supplier<String> {

    Random rand = new Random();
    List<String> animals = new ArrayList<>(Arrays.asList("cat", "parrot", "turtle", "eagle", "lion", "tiger", "monkey"));
    @Override
    public String get() {
        return null;
    }

    Supplier<String> randomString = () -> animals.get(rand.nextInt(animals.size()));
    /*int i = rand.nextInt(animals.size());
    animals.get(i)*/
}
