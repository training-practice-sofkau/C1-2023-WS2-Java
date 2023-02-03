package functional.interfaces.byfunction.exercise9;

import java.util.function.Function;

public class CountWords {
    public static int countWords(String str) {
        Function<String, Integer> count = x -> x.split(" ").length;
        return count.apply(str);
    }
}
