package functional.interfaces.byfunction.exercise10;

/*
String replacement
Create a function that replaces all occurrences of a given character in a string with another character, using a functional approach.
The function should take a string, and two characters as arguments and return the modified string. Use the replace method to replace the characters.
* */
public class Exercise10 {
    public static void main(String[] args) {

        //Calling the replace function:
        TriFunction<String, String, String, String> replacement =
        ( str, character1 , character2 ) -> str.replace(character1, character2);

        System.out.println(replacement.apply("This is a test", "t", "e"));
        System.out.println(replacement.apply("It looks quite weird", "o", "e"));
        System.out.println(replacement.apply("It is unreadable", "a", "y"));
    }
}
