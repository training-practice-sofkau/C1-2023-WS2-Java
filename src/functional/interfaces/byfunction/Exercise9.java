package functional.interfaces.byfunction;

import java.util.List;
import java.util.function.Function;

/*
Word Count
Create a class that counts the number of words in a given string using a Function<String, Integer>.
Use the apply method of the Function interface to count the words. Test the class by passing different
Function implementations that count the words in different ways.

* */
public class Exercise9 {

    public static void main(String[] args) {

        Function<String, Integer> countWords = p -> {
            List<String> ar = List.of(p.split(" "));
            return ar.size();
        };

        System.out.println(countWords.apply("Hola a todos como estan?"));
        System.out.println(countWords.apply("Hello"));
        System.out.println(countWords.apply("Hello from java"));
        System.out.println(countWords.apply("ha ha ha joke"));

    }
}
