package functional.interfaces.byfunction;

import java.util.function.Function;

/*
Word Count
Create a class that counts the number of words in a given string using a Function<String, Integer>.
Use the apply method of the Function interface to count the words. Test the class by passing different
Function implementations that count the words in different ways.

* */
public class Exercise8 {
    public static void main(String[] args) {
        Function<String, Integer> spaceSeparatedCounter = phrase -> {
            boolean phraseWhile = true;
            int wordCounter = 0;
            while (phraseWhile) {
                int nextSpace = phrase.indexOf(' ');
                if (nextSpace > -1) {
                    wordCounter++;
                    phrase = phrase.substring(nextSpace+1);
                }else{
                    phraseWhile = false;
                }
            }
            return wordCounter;
        };
        Function<String, Integer> comaSeparatedCounter = phrase -> {
            boolean phraseWhile = true;
            int wordCounter = 0;
            while (phraseWhile) {
                int nextSpace = phrase.indexOf(',');
                if (nextSpace > -1) {
                    wordCounter++;
                    phrase = phrase.substring(nextSpace+1);
                }else{
                    phraseWhile = false;
                }
            }
            return wordCounter;
        };
        Function<String, Integer> semicolonSeparatedCounter = phrase -> {
            boolean phraseWhile = true;
            int wordCounter = 0;
            while (phraseWhile) {
                int nextSpace = phrase.indexOf(';');
                if (nextSpace > -1) {
                    wordCounter++;
                    phrase = phrase.substring(nextSpace+1);
                }else{
                    phraseWhile = false;
                }
            }
            return wordCounter;
        };
        String spaceSeparatedPhrase = "hello world this a phrase of 8 words";
        String comaSeparatedPhrase = "hello,world,this,a,phrase,of,only,9,words";
        String semicolonSeparatedPhrase = "hello;world;this;a;phrase;of;exactly;10;single;words";
        System.out.println(getWordCount(spaceSeparatedCounter, spaceSeparatedPhrase));
        System.out.println(getWordCount(comaSeparatedCounter, comaSeparatedPhrase));
        System.out.println(getWordCount(semicolonSeparatedCounter, semicolonSeparatedPhrase));
    }

    static Integer getWordCount(Function<String, Integer> countingFunction, String phrase) {
        return countingFunction.apply(phrase);
    }
}
