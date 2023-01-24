package functional.interfaces.byfunction.exercise9;

import java.util.function.Function;

/*
String replacement
Create a function that replaces all occurrences of a given character in a string with another character, using a functional approach.
The function should take a string, and two characters as arguments and return the modified string. Use the replace method to replace the characters.
* */
public class Exercise9 implements CharacterReplacer {

    @Override
    public String replace(String s, char charA, char charB) {
        return s.replace(charA, charB);
    }

    public static void main(String[] args) {
        Exercise9 exercise9 = new Exercise9();
        String phrase = "The app will replace all occurrences of 'e' in this phrase with 'x'";
        System.out.println(phrase+"\n"+exercise9.replace(phrase,'e', 'x'));
    }
}
