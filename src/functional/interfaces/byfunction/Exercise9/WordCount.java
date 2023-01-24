package functional.interfaces.byfunction.Exercise9;

import java.util.function.Function;

public class WordCount {
    static Function<String, Integer> wordCounter = s -> s.split("\\s+").length;
}
