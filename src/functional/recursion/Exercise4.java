package functional.recursion;

import java.util.List;

import static functional.recursion.Palindrome.isPalindrome;

/*
* Create a function that checks if a string is a palindrome using recursion. The function should take a string as an argument and return a boolean indicating whether
* the string is a palindrome. Use the charAt method to access the individual characters of the string and the substring method to extract substrings.
 */
public class Exercise4 {
    public static void main(String[] args) {

        List<String> words = List.of("civic", "vehicle", "playground", "rotator", "stats");

        for (String word : words) {
            if (Palindrome.isPalindrome(word)){
                System.out.println("The word " + word + " is a palindrome");
            }else {
                System.out.println("The word " + word + " is not a palindrome");
            }
        }
    }

}
