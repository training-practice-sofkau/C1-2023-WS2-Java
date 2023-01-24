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
        String str1 = "How many words are in this sentence";
        String str2 = "We wake up early today";
        String str3 = "We are trying to understand, but dont get it";
        String str4 = "I have become a police officer  ";

        Function<String, Integer> wordCountFunction = str -> str.trim().split(" ").length;

        System.out.println("The sentence \"" + str1 + "\" has " + wordCountFunction.apply(str1) + " words");
        System.out.println("The sentence \"" + str2 + "\" has " + wordCountFunction.apply(str2) + " words");
        System.out.println("The sentence \"" + str3 + "\" has " + wordCountFunction.apply(str3) + " words");
        System.out.println("The sentence \"" + str4 + "\" has " + wordCountFunction.apply(str4) + " words");

    }
}
