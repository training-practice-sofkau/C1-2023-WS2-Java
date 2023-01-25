package functional.interfaces.byfunction.exercise9;

import java.util.function.Function;

public class CountWords implements Function<String,Integer> {
    @Override
    public Integer apply(String s) {
        String [] cutStri =
                s.split(" ");

        return cutStri.length;
    }
}
