package functional.interfaces.byfunction.exercise10;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class StringReplacement implements BiFunction<String,String,String> {


    @Override
    public String apply(String s, String s2) {
        String firstChar = s2.charAt(0)+"";
        String secondChar = s2.charAt(1)+"";

        String newString = s.replaceAll( firstChar ,secondChar );
        return newString;
    }
}


