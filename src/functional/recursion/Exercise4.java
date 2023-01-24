package functional.recursion;

/*
* Create a function that checks if a string is a palindrome using recursion. The function should take a string as an argument and return a boolean indicating whether
* the string is a palindrome. Use the charAt method to access the individual characters of the string and the substring method to extract substrings.
 */
public class Exercise4 {
    public static void main(String[] args) {

        Palindrome palindrome = new Palindrome();
        System.out.println("reviver is a palindrome? "+palindrome.isPalindrome("reviver"));
        System.out.println("Julian is a palindrome? "+palindrome.isPalindrome("Julian"));
    }

}
