package functional.interfaces.byfunction.exercise10;

import java.util.function.Function;

/*
String replacement
Create a function that replaces all occurrences of a given character in a string with another character, using a functional approach.
The function should take a string, and two characters as arguments and return the modified string. Use the replace method to replace the characters.
* */
public class Exercise10 {
    public static void main(String[] args) {
        Replace replaceLetter = new Replace();
        String s = "blood roots and monotonousness";
        System.out.println(replaceLetter.replacer("a", "o", s));
    }
}
