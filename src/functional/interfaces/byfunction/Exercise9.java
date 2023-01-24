package functional.interfaces.byfunction;

import java.util.function.Function;

/*
Word Count
Create a class that counts the number of words in a given string using a Function<String, Integer>.
Use the apply method of the Function interface to count the words. Test the class by passing different
Function implementations that count the words in different ways.

* */
public class Exercise9 {
    public static void main(String[] args) {

        // Function that counts the number of words in a given string
        Function<String, Integer> wordCount = str -> str.split("\\s+").length;

        // Test the class by passing different Function implementations
        System.out.println(wordCount.apply("The quick brown fox jumps over the lazy dog"));
        System.out.println(wordCount.apply("This a a simple functional exercise"));
        System.out.println(wordCount.apply("There is a big house up in the hills"));
    }
}
