package functional.interfaces.byfunction.Exercise9;

import java.util.function.BiFunction;

/*
Word Count
Create a class that counts the number of words in a given string using a Function<String, Integer>.
Use the apply method of the Function interface to count the words. Test the class by passing different
Function implementations that count the words in different ways.

* */
public class Exercise9 {
    public static void main(String[] args) {
        int words = WordCount.wordCounter.apply("Hola mundo cruel");
        System.out.println(words);
    }
    


}

