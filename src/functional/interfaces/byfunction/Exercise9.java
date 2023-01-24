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

        Function<String, Integer> count = (s) -> {
            return s.split(" ").length;
        };

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Curabitur venenatis condimentum nisl, viverra viverra nibh faucibus eu. " +
                "Vestibulum a aliquet purus. " +
                "Mauris cursus.";


        System.out.println("Count of words in text: " + count.apply(text));
    }
}
