package functional.interfaces.byfunction;

import functional.interfaces.byfunction.exercise10.TriFunction;

import java.util.function.Function;

/*
String replacement
Create a function that replaces all occurrences of a given character in a string with another character, using a functional approach.
The function should take a string, and two characters as arguments and return the modified string. Use the replace method to replace the characters.
* */
public class Exercise10 {

    public static void main(String[] args) {

        TriFunction<Character,Character,String,String> myTriFunction = (x, y, z)-> z.replace(x,y);

        System.out.println(myTriFunction.apply('a','o',"aloha"));

        System.out.println(myTriFunction.apply('e','i',"Pero es que no me tienen paciencia"));

    }
}
