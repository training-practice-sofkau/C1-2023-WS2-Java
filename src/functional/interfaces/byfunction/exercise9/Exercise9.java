package functional.interfaces.byfunction.exercise9;

/*
Word Count
Create a class that counts the number of words in a given string using a Function<String, Integer>.
Use the apply method of the Function interface to count the words. Test the class by passing different
Function implementations that count the words in different ways.

* */
public class Exercise9 {
    public static void main (String[] args){
        CountWords countWords = new CountWords();
        System.out.println(countWords.apply("He"));
        System.out.println(countWords.apply("hola mundo"));
        System.out.println(countWords.apply("hola amigos"));
        System.out.println(countWords.apply("hello word"));
        System.out.println(countWords.apply("hello from the other side"));
    }
}
