package functional.interfaces.byfunction;
/*
String replacement
Create a function that replaces all occurrences of a given character in a string with another character, using a functional approach.
The function should take a string, and two characters as arguments and return the modified string. Use the replace method to replace the characters.
* */
public class Exercise10 {
    public static void main(String[] args) {
        System.out.println(replaceChar("Great day to code", 'a', 'o'));
    }

    public static String replaceChar(String str, char x, char y){
       return str.replace(x, y);
    }
}
