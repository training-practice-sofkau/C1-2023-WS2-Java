package functional.recursion;

/*
* Create a function that checks if a string is a palindrome using recursion. The function should take a string as an argument and return a boolean indicating whether
* the string is a palindrome. Use the charAt method to access the individual characters of the string and the substring method to extract substrings.
 */
public class Exercise4 {
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Racecar"));
        System.out.println(Palindrome.isPalindrome("Anna"));
        System.out.println(Palindrome.isPalindrome("Mom"));
        System.out.println(Palindrome.isPalindrome(""));
        System.out.println(Palindrome.isPalindrome("Pop"));
        System.out.println(Palindrome.isPalindrome("Rotor"));
        System.out.println(Palindrome.isPalindrome("ab"));
        System.out.println(Palindrome.isPalindrome("a"));
        System.out.println(Palindrome.isPalindrome("Solos"));
        System.out.println(Palindrome.isPalindrome("Solo"));
    }

}
