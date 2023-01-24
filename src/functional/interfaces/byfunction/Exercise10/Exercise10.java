package functional.interfaces.byfunction.Exercise10;


import java.util.function.Function;

/*
String replacement
Create a function that replaces all occurrences of a given character in a string with another character, using a functional approach.
The function should take a string, and two characters as arguments and return the modified string. Use the replace method to replace the characters.
* */
public class Exercise10 {
    public static void main(String[] args) {
        String str1 = "How many words are in this sentence";
        String str2 = "We wake up early today";
        String str3 = "We are trying to understand, but dont get it";
        String str4 = "I have become a police officer  ";

        StringReplacer<String> stringReplacementFunction = (str, a, b) -> str.replaceAll(a, b);

        String oldChar = "a";
        String newChar = "A";
        System.out.println("Old: \"" + str1 + "\" \nNew: \"" + stringReplacementFunction.apply(str1, oldChar, newChar) + "\"\n");
        System.out.println("Old: \"" + str2 + "\" \nNew: \"" + stringReplacementFunction.apply(str2, oldChar, newChar) + "\"\n");
        System.out.println("Old: \"" + str3 + "\" \nNew: \"" + stringReplacementFunction.apply(str3, oldChar, newChar) + "\"\n");
        System.out.println("Old: \"" + str4 + "\" \nNew: \"" + stringReplacementFunction.apply(str4, oldChar, newChar) + "\"\n");

    }
}
